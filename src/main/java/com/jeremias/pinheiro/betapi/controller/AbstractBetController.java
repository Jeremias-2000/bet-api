package com.jeremias.pinheiro.betapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public interface AbstractBetController {

    @GetMapping("/bets")
    ResponseEntity<?> findBets();
}
