package com.io.nwl.modules.certificados.repository;

import com.io.nwl.modules.certificados.model.Certificado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCertificados extends JpaRepository<Certificado,Long> {
}
