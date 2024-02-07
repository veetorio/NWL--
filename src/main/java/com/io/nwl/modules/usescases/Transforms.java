package com.io.nwl.modules.usescases;

import com.io.nwl.modules.certificados.DTO.DTOCertificado;
import com.io.nwl.modules.certificados.model.Certificado;
import com.io.nwl.modules.usuarios.DTO.DTOUser;
import com.io.nwl.modules.usuarios.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface Transforms {

    default List<DTOCertificado> TransformCertificadoInDtoCertificado(List<Certificado> list) throws Exception{
        return list.stream()
                .map(DTOCertificado::new)
                .collect(Collectors
                        .toList());
    }
    default List<DTOUser> TransformUserInDtoUser(List<User> list) throws Exception{
        List<DTOUser> result = new ArrayList<>();
        for (User user : list) {
            DTOUser dtoUser = new DTOUser(user);
            result.add(dtoUser);
        }
        return result;
    }

}
