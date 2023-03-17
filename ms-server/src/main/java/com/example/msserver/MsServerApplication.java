package com.example.msserver;

import com.example.msserver.entity.Configuation;
import com.example.msserver.entity.Server;
import com.example.msserver.repository.ServerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsServerApplication implements CommandLineRunner {
    @Autowired
    ServerRepo serverRepo;


    public static void main(String[] args) {
        SpringApplication.run(MsServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        serverRepo.save(new Server(null,new Configuation(11,32,2000),"Google",null));




    }
}
