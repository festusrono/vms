package com.vaccine.vms.repository;

import com.vaccine.vms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
