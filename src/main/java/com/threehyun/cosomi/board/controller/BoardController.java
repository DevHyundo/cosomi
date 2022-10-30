package com.threehyun.cosomi.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board")
    public String getBoardMainPage(){
        return "/group/board/board.html";
    }
}
