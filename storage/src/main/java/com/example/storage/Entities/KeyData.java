package com.example.storage.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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