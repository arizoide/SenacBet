package com.senac.SenacBet.dao;

import com.senac.SenacBet.model.Contato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoDAO extends CrudRepository<Contato, Integer> {
}
