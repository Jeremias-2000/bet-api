package com.jeremias.pinheiro.betapi.service;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface AbstractService<B> {

    List<B> findBets();
}
