package com.example.msuser.proxy;

import com.example.msuser.entity.Configuation;
import com.example.msuser.model.Server;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-server")
@LoadBalancerClient(name="ms-server")
public interface ServerProx {
    @GetMapping("/servers/{id}")
    public Server getServer(@PathVariable("id") Long ids);
    default Server fallbackCount(Throwable throwable) {
        return new Server();
    }
}
