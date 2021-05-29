package com.jeremias.pinheiro.betapi.repository;


import com.jeremias.pinheiro.betapi.entity.Bet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRepository extends JpaRepository<Bet,Long> {
}
