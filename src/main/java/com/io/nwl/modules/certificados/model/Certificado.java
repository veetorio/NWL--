package com.io.nwl.modules.certificados.model;

import com.io.nwl.modules.usuarios.model.User;
import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB-Certificado")
public class Certificado {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String certicate;
    private String nivel;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
