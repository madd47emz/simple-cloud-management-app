package com.example.msserver.entity;

import com.example.msserver.model.Vmachine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idserver;
    @Embedded
    private Configuation configuation;

    private String datacenter;

    @Transient
    private Collection<Vmachine> vmachines;
}
