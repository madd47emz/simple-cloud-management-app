package com.example.msuser.repository;

import com.example.msuser.entity.Usere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Usere,Long> {
}
