package com.example.storage.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import org.iq80.leveldb.*;
import static org.iq80.leveldb.impl.Iq80DBFactory.*;
import java.io.*;

@Component
@Profile("leveldb")
public class LevelDbImpl implements ServerComponent {
    private DB db;
    public LevelDbImpl() throws IOException {
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
}
