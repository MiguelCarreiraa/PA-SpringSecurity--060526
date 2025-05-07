package com.MikeON.SpringSecurity.controllers;


import com.MikeON.SpringSecurity.models.PessoaModel;
import com.MikeON.SpringSecurity.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/pessoas")
@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll(){
        return pessoaService.findAll();
    }

    @PostMapping
    public PessoaModel criarPessoa(@RequestBody PessoaModel pessoaModel){
        return pessoaService.criarPessoa(pessoaModel);
    }

}
