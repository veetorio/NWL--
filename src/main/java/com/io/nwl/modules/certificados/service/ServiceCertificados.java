package com.io.nwl.modules.certificados.service;

import com.io.nwl.modules.certificados.repository.RepositoryCertificados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCertificados {
    @Autowired
    RepositoryCertificados repository;

}
