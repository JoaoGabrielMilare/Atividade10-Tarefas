package com.example.Tarefas.Services;


import com.example.Tarefas.Model.TarefaModel;
import com.example.Tarefas.Repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServices {
    @Autowired
    private TarefaRepository tarefaRepository;

    public TarefaModel criarTarefa(TarefaModel tarefa){
        return tarefaRepository.save(tarefa);
    }

    public List<TarefaModel> listarTarefa(){
        return tarefaRepository.findAll();
    }

    public TarefaModel buscarTarefa(Long id){
        return tarefaRepository.findById(id).orElse(null);
    }

    public void deletarTarefa(Long id){
        tarefaRepository.deleteById(id);
    }

}
