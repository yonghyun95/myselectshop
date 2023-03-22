package com.example.myselectshop.controller;


import com.example.myselectshop.service.FolderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api")
public class ShopController {

    private final FolderService folderService;

    @GetMapping("/shop")
    public ModelAndView shop() {
        return new ModelAndView("index");
    }

    // 로그인 한 유저가 메인페이지를 요청할 때 가지고있는 폴더를 반환
    // 비동기 부분이며, index-Ajox 부분으로 바꿔준다
    @GetMapping("/user-folder")
    public String getUserInfo(Model model, HttpServletRequest request) {

        model.addAttribute("folders", folderService.getFolders(request));

        return "/index :: #fragment";
    }

}