package com.br.portifolioIO.Todolist.user;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jdk.jfr.Name;
import lombok.Data;
import lombok.Getter;

import java.util.UUID;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    public String name;
    public String nickname;
    public String password;


}
