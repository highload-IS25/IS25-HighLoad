package com.example.storage.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@Table(name = "info")
@Data
public class KeyData {
    @Id
    private String key;
    private String value;

    public KeyData() {

    }
}