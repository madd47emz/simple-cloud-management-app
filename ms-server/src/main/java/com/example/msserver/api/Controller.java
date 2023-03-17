package com.example.msserver.api;

import com.example.msserver.entity.Server;
import com.example.msserver.model.Vmachine;
import com.example.msserver.proxy.Vmprox;
import com.example.msserver.repository.ServerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api")
public class Controller {
    @Autowired
    ServerRepo serverRepo;
    @Autowired
    Vmprox vmprox;
    @GetMapping("/server/{id}/remaining-ram")
    public double getRemainingRam(@PathVariable("id") Long ids)
    {


        Server s = serverRepo.findById(ids).get();
        double ram = s.getConfiguation().getRam();
        List<Vmachine> list = new ArrayList<Vmachine>(vmprox.getMachines(s.getIdserver()));
        for (int i = 0; i < list.size(); i++) {
            ram = ram-list.get(i).getConfiguation().getRam();

        }


        return  ram;
    }
}
