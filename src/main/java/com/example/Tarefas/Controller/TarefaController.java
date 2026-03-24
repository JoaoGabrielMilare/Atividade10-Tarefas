package com.example.Tarefas.Controller;


import com.example.Tarefas.Model.TarefaModel;
import com.example.Tarefas.Services.TarefaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private TarefaServices tarefasServices;

    @PostMapping
    public TarefaModel salvar(@RequestBody TarefaModel tarefaModel){
        return tarefasServices.criarTarefa(tarefaModel);
    }

    @GetMapping
    public List<TarefaModel> listarTarefa(){
        return tarefasServices.listarTarefa();
    }
    @GetMapping("/{id}")
    public TarefaModel buscarTarefa(@PathVariable Long id){
        return tarefasServices.buscarTarefa(id);
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id){
        tarefasServices.deletarTarefa(id);
    }
}
