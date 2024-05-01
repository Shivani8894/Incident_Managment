package com.example.login.modal;

import lombok.*;

@Builder
@Data
@Getter
@Setter
@AllArgsConstructor
public class Users {

    //@Id
    private String id;
    private String username;
    private String password;

}
