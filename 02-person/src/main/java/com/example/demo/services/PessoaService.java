package com.example.demo.services;

import com.example.demo.models.Pessoa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PessoaService {

    private final AtomicLong counter = new AtomicLong();

    public Pessoa create(Pessoa pessoa){
        return pessoa;
    }

    public Pessoa findById(String id){
        Pessoa pessoa = new Pessoa();
        pessoa.setId(counter.incrementAndGet());
        pessoa.setNome("Isabella");
        pessoa.setSobrenome("Suto");
        pessoa.setEndereco("Brasil");
        pessoa.setGenero("Feminino");
        return pessoa;
    }

    public List<Pessoa> findAll(){
        int cont = 8;
        List<Pessoa> lista = new ArrayList<>();
        for (int i =0; i<8; i++) {
            Pessoa pessoa = mockPessoa(i);
            lista.add(pessoa);
        }
        return lista;
    }

    private Pessoa mockPessoa(int i) {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(counter.incrementAndGet());
        pessoa.setNome("Nome "+i);
        pessoa.setSobrenome("Sobrenome"+i);
        pessoa.setEndereco("Brasil"+i);
        pessoa.setGenero("Feminino"+i);

        return pessoa;
    }

    public Pessoa update(Pessoa pessoa) {
        return pessoa;
    }

    public void delete(String id){

    }
}
