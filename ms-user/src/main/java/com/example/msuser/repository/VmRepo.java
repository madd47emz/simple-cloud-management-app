package com.example.msuser.repository;

import com.example.msuser.entity.Vmachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

public interface VmRepo extends JpaRepository<Vmachine,Long> {
    List<Vmachine> findVmachinesByIdserver(Long ids);
}
