package com.io.nwl.modules.certificados.DTO;

import com.io.nwl.modules.certificados.model.Certificado;

public record DTOCertificado(String certificado , String nivel) {
    public DTOCertificado(Certificado certificado){
        this(
                certificado.getCerticate(),
                certificado.getNivel()
                );
    }

}
