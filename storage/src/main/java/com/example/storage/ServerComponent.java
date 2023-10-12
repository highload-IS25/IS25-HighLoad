package com.example.storage;

public class ServerComponent {
    private final StorageService storageInterface;

    public ServerComponent(StorageService storageInterface) {
        this.storageInterface = storageInterface;
    }

    public void serve() {
        // Реализация HTTP сервера
        // Обработка GET /keys/${key} и PUT /keys/${key}?value=${value} запросов
    }
}

