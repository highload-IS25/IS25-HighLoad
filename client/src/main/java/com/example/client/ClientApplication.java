package com.example.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        ClientComponent clientComponent = new ClientComponent();
        if(args[0].equals("get")){
            try{
                String value = clientComponent.get(args[1]);
                System.out.println("Get Key Value Pair:" + args[1] + " " + value);
            } catch (Exception e){
                System.err.println("Error while getting Key Value pair:" + e.getMessage());
            } finally {
                System.out.println("-----");
            }
        } else if(args[0].equals("set")){
            try {
                clientComponent.set(args[1], args[2]);
                System.out.println("Set Key Value Pair");
            } catch (Exception e){
                System.err.println("Error while setting Key Value pair:" + e.getMessage());
            }
        } else{
            System.err.println("bad input: command not supported");
        }

    }
}
