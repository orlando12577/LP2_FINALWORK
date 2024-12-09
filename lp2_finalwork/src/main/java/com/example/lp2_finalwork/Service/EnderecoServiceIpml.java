package com.example.lp2_finalwork.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Repository.EnderecoRepository;
import com.example.lp2_finalwork.entity.Endereco;

@Service
public class EnderecoServiceIpml implements EnderecoService{

    @Autowired
    private EnderecoRepository enderecoRepo;
    
    @Override
    public Endereco buscarEnderecoPorId(Long id) {
        Optional<Endereco> enderecoOp = enderecoRepo.findById(id);
        if(enderecoOp.isEmpty()){
            throw new IllegalArgumentException("Endereço não encontrado!");
        }
        return enderecoOp.get();
    }
    
}