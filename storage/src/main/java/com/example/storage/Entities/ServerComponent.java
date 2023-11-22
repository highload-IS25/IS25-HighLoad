package com.example.storage.Entities;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import org.iq80.leveldb.*;
import static org.iq80.leveldb.impl.Iq80DBFactory.*;
import java.io.*;

@Service
public class ServerComponent {
    private DB db;
    public ServerComponent() throws IOException {
        Options options = new Options();
        options.createIfMissing(true);
        db = factory.open(new File("file/alo.db"), options);
    }

    public String get(String key){
        return asString(db.get(bytes(key)));
    }

    public void set(String key, String value){
        db.put(bytes(key), bytes(value));
    }

    public void close() throws IOException {
        db.close();
    }
}
