package com.example.myselectshop.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto { // 회원가입할때 필요한 것들
    private String username;
    private String password;
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}