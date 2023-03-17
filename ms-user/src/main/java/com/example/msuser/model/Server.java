package com.example.msuser.model;

import com.example.msuser.entity.Configuation;
import com.example.msuser.entity.Vmachine;
import jakarta.persistence.Transient;
import lombok.Data;

import java.util.Collection;

@Data
public class Server {
    private Long idserver;
    private Configuation configuation;
    private String datacenter;

    @Transient
    private Collection<Vmachine> vmachines;
}
