package com.example.client;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ClientComponent {
    private static final String SERVICE_URL = "http://storage:8090/";

    public String get(String key) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(SERVICE_URL + key, String.class);
        return response.getBody();
    }

    public void set(String key, String value) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<String> request = new HttpEntity<>(value);
            ResponseEntity<String> response = restTemplate.exchange(SERVICE_URL + key, HttpMethod.PUT, request, String.class);
        } catch (ResourceAccessException e) {
            System.err.println("Failed to connect to the server: " + e.getMessage());
        } catch (RestClientException e) {
            System.err.println("HTTP request failed: " + e.getMessage());
        }
    }
}
