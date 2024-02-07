package com.io.nwl.modules.usuarios.DTO;

import com.io.nwl.modules.certificados.DTO.DTOCertificado;
import com.io.nwl.modules.usescases.Transforms;
import com.io.nwl.modules.usuarios.model.User;
import com.io.nwl.modules.usuarios.service.ServiceUsuario;

import java.util.List;


public record DTOUser (String email,String banner,String icon,List<DTOCertificado> certificados){
    public DTOUser(User user) throws Exception {
        this(user.getEmail(),user.getBanner(), user.getIcon(),user.TransformCertificadoInDtoCertificado(user.getCertificados()));
    }
}
