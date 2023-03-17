package com.example.msserver.proxy;

import com.example.msserver.model.Vmachine;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="ms-user")
@LoadBalancerClient(name="ms-user")
public interface Vmprox {
    @GetMapping("/vmachines/search/findVmachinesByIdserver")
    public List<Vmachine> getMachines(@RequestParam("ids") Long ids);
}
