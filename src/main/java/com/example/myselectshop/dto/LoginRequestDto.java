package com.example.myselectshop.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequestDto {  // 로그인 할때 필요한 것들
    private String username;
    private String password;
}