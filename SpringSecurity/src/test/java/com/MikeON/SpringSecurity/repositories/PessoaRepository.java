package com.MikeON.springSecurity.repositories;

import com.MikeON.springSecurity.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}