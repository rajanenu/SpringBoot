package com.rc.passwordreset.model;

import lombok.*;

import javax.persistence.*;

@Entity(name = "LOGIN_USER")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoginUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="NUID",nullable = false,unique = true)
    private String NUID;

    @Column(name="USER_NAME")
    private String userName;

    @Column(name="PWD")
    private String password;


}
