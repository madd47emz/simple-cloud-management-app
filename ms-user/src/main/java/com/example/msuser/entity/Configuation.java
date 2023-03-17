package com.example.msuser.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@Data @AllArgsConstructor
@NoArgsConstructor
public class Configuation implements Serializable {
    private double cpu;
    private double ram;
    private double disk;
}
