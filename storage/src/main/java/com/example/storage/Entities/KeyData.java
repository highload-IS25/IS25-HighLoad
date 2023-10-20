package com.example.storage.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@Table(name = "INFO")
@Data
public class KeyData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String key;
    private String value;

    public KeyData() {

    }
}