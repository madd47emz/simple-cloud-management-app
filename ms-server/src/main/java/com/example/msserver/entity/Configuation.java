package com.example.msserver.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data @AllArgsConstructor
@NoArgsConstructor
public class Configuation implements Serializable {
    private double cpu;
    private double ram;
    private double disk;
}
