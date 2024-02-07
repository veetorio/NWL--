package com.io.nwl.modules.usuarios.model;

import com.io.nwl.modules.certificados.model.Certificado;
import com.io.nwl.modules.usescases.Transforms;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;


@Data
@Entity
@Table(name = "TB-User")
public class User implements Transforms {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String email;

    private String icon;

    private String banner;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private List<Certificado> certificados;

}
