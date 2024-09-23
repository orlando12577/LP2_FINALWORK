package com.example.lp2_finalwork.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2_finalwork.Models.Veiculo;
import com.example.lp2_finalwork.Repository.VeiculosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculosRepository veiculoRepository;

    public Veiculo save(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Veiculo update(Veiculo veiculo) {
        if(veiculoRepository.existsById(veiculo.getVeiId())) {
            return veiculoRepository.save(veiculo);
        }
        throw new RuntimeException("Veiculo não encontrado");
    }

    public void delete(Integer id) {
        veiculoRepository.deleteById(id);
    }

    public Optional<Veiculo> findById(Integer id) {
        return veiculoRepository.findById(id);
    }

    public List<Veiculo> findAll() {
        return veiculoRepository.findAll();
    }
}
