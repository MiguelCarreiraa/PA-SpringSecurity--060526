package com.MikeON.SpringSecurity.repositories;

import com.MikeON.SpringSecurity.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
}