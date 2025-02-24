package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Create
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";
    }

    //ReadAll
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Todos os ninjas";
    }

    //ReadById
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar ninjas por ID";
    }

    //Update
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Ninja alterado";
    }

    //Delete
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por id";
    }
}
