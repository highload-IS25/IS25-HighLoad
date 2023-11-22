package com.example.storage.Controllers;

import com.example.storage.Entities.ServerComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StorageController {
    private final ServerComponent storage;
    @Autowired
    public StorageController(ServerComponent serverComponent) {this.storage = serverComponent;}
    @GetMapping("/{key}")
    public ResponseEntity<String> getValue(@PathVariable String key) {
        String value = storage.get(key);
        if (value != null) {
            return new ResponseEntity<>(value, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{key}")
    public ResponseEntity<Void> putValue(@PathVariable String key, @RequestBody String value) {
        storage.set(key, value);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
