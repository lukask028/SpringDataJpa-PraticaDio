package me.dio.academia.digital.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    /*@Query(value = "SELECT * FROM tb_matriculas m" + 
    "INNER JOIN tb_alunos a on m.aluno_id = a.id" +
    "WHERE  a.bairro = :bairro", nativeQuery = true)

    //@Query( "FROM Matricula m WHERE m.aluno.bairro = :bairro") */
    
    

    
    List<Matricula> findAlunosMatriculadosBairro(String bairro);

   

    
}
