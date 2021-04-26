package com.edujava.facturas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.edujava.facturas.entitis.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
