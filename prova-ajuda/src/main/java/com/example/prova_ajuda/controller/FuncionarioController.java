package com.example.prova_ajuda.controller; // definição da pasta


import org.springframework.web.bind.annotation.*; 
import com.example.prova_ajuda.model.Funcionario;
import com.example.prova_ajuda.repository.FuncionarioRepository;
import java.util.List;


@CrossOrigin("*") //permite requisicoes de qualuqer origin 
@RestController //marca essa classe com um controler rest
@RequestMapping("/api/funcionarios") //define o caminho 
public class FuncionarioController { 

    private final FuncionarioRepository repository; //declara a variavel

    public FuncionarioController(FuncionarioRepository repository) {  // Construtor que injeta o repositório na classe
        this.repository = repository;
    }

    @GetMapping //metodo de requisicoes http get
    public List<Funcionario> listar() { // recebe o objeto funcionario no corpo 
        return repository.findAll(); // busca todos funcionarios do banco de dados 
    }

    @PostMapping //meteodo puxa reponder a requisiçoes hht post 
    public Funcionario adicionar(@RequestBody Funcionario funcionario) { //recebe um objeto funcionariono corpo e salva no banco
        return repository.save(funcionario); // salva o funcionario e retorna ele salva
    }

    @PutMapping("/{id}") //Método para responder a requisições HTTP PUT 
    public Funcionario editar(@PathVariable Long id, @RequestBody Funcionario funcionario) { //Atualiza o funcionário com o id especificado usando os dados do corpo
        funcionario.setId(id);// define o id do funcionário para garantir que o update será no registro
        return repository.save(funcionario);// salva as alterações e retorna
    }

    @DeleteMapping("/{id}") // Método para responder a requisições HTTP DELETE
    public void excluir(@PathVariable Long id) {//Remove o funcionário com o id especificado
        repository.deleteById(id);// deleta o funcionário do banco pelo id
    }
}
