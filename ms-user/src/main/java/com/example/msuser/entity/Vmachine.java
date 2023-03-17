package com.example.msuser.entity;

import com.example.msuser.model.Server;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vmachine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvm;

    @Embedded
    private Configuation configuation;

    @ManyToOne
    @JoinColumn(name="iduser")
    private Usere usere;

    private Long idserver;
    @Transient
    private Server server;


}
