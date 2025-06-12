// Define o pacote onde essa interface está localizada
package com.example.prova_ajuda.repository;

// Importa a interface JpaRepository do Spring Data JPA
import org.springframework.data.jpa.repository.JpaRepository;

// Importa a entidade Funcionario que será manipulada pelo repositório
import com.example.prova_ajuda.model.Funcionario;

// Declara a interface do repositório, que estende JpaRepository
// Isso faz com que ela herde vários métodos prontos, como save(), findAll(), findById(), deleteById() etc.
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {}
//                      ^                       ^
// Nome da interface                             - Tipo do ID da entidade (Long)
//                       -- Entidade que esse repositório manipula (Funcionario)
