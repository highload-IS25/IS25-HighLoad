
package com.example.client;

import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        ClientComponent client = new ClientComponent();
        client.set("test", "value");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter command:");
        String command = scanner.nextLine();

        switch (command) {
            case "get":
                System.out.println("Enter key:");
                String getKey = scanner.nextLine();
                System.out.println(client.get(getKey));
                break;
            case "set":
                System.out.println("Enter key:");
                String setKey = scanner.nextLine();
                System.out.println("Enter value:");
                String setValue = scanner.nextLine();
                client.set(setKey, setValue);
                break;
            default:
                System.out.println("Invalid command");
        }

    }
}
