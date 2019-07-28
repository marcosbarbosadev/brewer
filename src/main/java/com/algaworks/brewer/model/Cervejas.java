package com.algaworks.brewer.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long> {

}
