package com.socialnetwork.SocialNetwork.model.domain;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "no puede estar vacio")
    private String name;
    @NotEmpty(message = "no puede estar vacio")
    private String email;
    @NotEmpty(message = "no puede estar vacio")
    private String password;
    @NotEmpty(message = "no puede estar vacio")
    private String gender;

    private Date birthate;

    private Integer cellPhone;





}
