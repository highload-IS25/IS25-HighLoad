package com.example.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ClientComponent {
    private static final String SERVICE_URL = "http://localhost:8080/keys/";

    public String get(String key) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(SERVICE_URL + key, String.class);
        return response.getBody();
    }

    public void set(String key, String value) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> request = new HttpEntity<>(value);
        restTemplate.exchange(SERVICE_URL + key, HttpMethod.PUT, request, Void.class);
    }

    public static void main(String[] args) {
        ClientComponent client = new ClientComponent();
        client.set("test", "value");
        System.out.println(client.get("test"));
    }
}
