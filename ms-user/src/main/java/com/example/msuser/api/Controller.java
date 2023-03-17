package com.example.msuser.api;

import com.example.msuser.entity.Vmachine;
import com.example.msuser.proxy.ServerProx;
import com.example.msuser.repository.VmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {
    @Autowired
    VmRepo vmRepo;
    @Autowired
    ServerProx serverProx;
    @GetMapping("getVmServer/{id}")
    public Vmachine getVmServer(@PathVariable("id") Long ide)
    {

        Vmachine vmachine = vmRepo.findById(ide).get();

        vmachine.setServer(serverProx.getServer(vmachine.getIdserver()));


        return  vmachine;
    }
}