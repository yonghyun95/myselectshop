package com.example.myselectshop.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne // 많은 폴더를 한 사람이 관리할 수 있다.
    @JoinColumn(name = "USER_ID", nullable = false) // 외래키 USER_ID와 ID는 연관 관계이다.
    private User user;

    public Folder(String name, User user) {
        this.name = name;
        this.user = user;
    }
}