package com.jeremias.pinheiro.betapi.service;

import com.jeremias.pinheiro.betapi.entity.Bet;
import com.jeremias.pinheiro.betapi.repository.BetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetService implements AbstractService<Bet>{

    @Autowired
    private BetRepository betRepository;

    @Override
    public List<Bet> findBets() {
        return betRepository.findAll();
    }
}
