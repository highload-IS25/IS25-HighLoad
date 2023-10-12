package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        ClientComponent client = new ClientComponent();

        switch (args[0]) {
            case "get":
                System.out.println(client.get(args[1]));
                break;
            case "set":
                client.set(args[1], args[2]);
                break;
            default:
                System.out.println("Invalid command");
        }

    }
}
