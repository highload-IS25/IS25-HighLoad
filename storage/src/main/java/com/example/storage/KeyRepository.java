package com.example.storage;

import com.example.storage.Entities.KeyData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyRepository extends JpaRepository<KeyData, String> {
}
