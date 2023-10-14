package com.example.storage.Entities;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@AllArgsConstructor
public class KeyData {
    @Id
    private String key;
    private String value;

    public KeyData(){}
}
