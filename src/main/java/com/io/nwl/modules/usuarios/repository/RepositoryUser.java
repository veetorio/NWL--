package com.io.nwl.modules.usuarios.repository;

import com.io.nwl.modules.usuarios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RepositoryUser extends JpaRepository<User, UUID> {
}
