package com.io.nwl.modules.usuarios.service;

import com.io.nwl.modules.usescases.Transforms;
import com.io.nwl.modules.usuarios.DTO.DTOUser;
import com.io.nwl.modules.usuarios.model.User;
import com.io.nwl.modules.usuarios.repository.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUsuario implements Transforms {
    @Autowired
    RepositoryUser repository;

    public DTOUser create(User user) throws Exception {
        repository.save(user);
        return new DTOUser(user);
    }
    public List find() throws Exception {
        return TransformUserInDtoUser(repository.findAll());
    }

}
