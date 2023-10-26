package com.senai.eduardo.PrjGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.eduardo.PrjGame.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

}
