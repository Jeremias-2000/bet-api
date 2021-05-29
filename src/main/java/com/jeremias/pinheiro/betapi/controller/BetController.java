package com.jeremias.pinheiro.betapi.controller;

import com.jeremias.pinheiro.betapi.service.BetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bets")
public class BetController implements AbstractBetController{

    @Autowired
    private BetService betService;

    @Override
    public ResponseEntity<?> findBets() {
        return ResponseEntity.ok(betService.findBets());
    }
}
