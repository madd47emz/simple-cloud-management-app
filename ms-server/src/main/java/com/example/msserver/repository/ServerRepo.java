package com.example.msserver.repository;

import com.example.msserver.entity.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server,Long> {

}
