package com.rc.passwordreset.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "LOGIN_USER")
public class LoginUser {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NUID", nullable = false, unique = true)
    private String NUID;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PWD")
    private String password;


}
