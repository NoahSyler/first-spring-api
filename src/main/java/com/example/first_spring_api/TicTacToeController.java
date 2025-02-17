package com.example.first_spring_api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TicTacToeController {

    @GetMapping("/tic-tac-toe")
    public String hello() {
        return "hello";
    }
}