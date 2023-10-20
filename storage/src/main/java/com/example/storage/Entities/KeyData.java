package com.example.storage.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "info")
@Data
public class KeyData {
    @Id
    private String key;
    private String value;
}