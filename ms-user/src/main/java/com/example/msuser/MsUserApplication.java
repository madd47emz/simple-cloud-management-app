package com.example.msuser;

import com.example.msuser.entity.Configuation;
import com.example.msuser.entity.Usere;
import com.example.msuser.entity.Vmachine;
import com.example.msuser.repository.UserRepo;
import com.example.msuser.repository.VmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsUserApplication implements CommandLineRunner {
    @Autowired
    UserRepo userRepo;
    @Autowired
    VmRepo vmRepo;

    public static void main(String[] args) {
        SpringApplication.run(MsUserApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Usere u = userRepo.save(new Usere(null,"Mohamed Emziane","emziane@gmail.com",null));
        vmRepo.save(new Vmachine(null,new Configuation(5,8.0,256.0),u,1L,null));
        vmRepo.save(new Vmachine(null,new Configuation(3,4.0,512.0),u,1L,null));



    }
}
