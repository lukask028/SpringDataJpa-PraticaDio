package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AlunoForm {
    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max = 50, message = "'${validateValue}' precisa estar entre {min} e {max} caracteres.")

  private String nome;
  @NotEmpty(message = "'Preencha o campo corretamente.")
  @CPF(message = "'${validateValue}' é inválido!")
  private String cpf;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max = 50, message = "'${validateValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  @NotNull(message = "'Preencha o campo corretamente.")
  @Past(message = "'${validateValue}' é inválido!")
  private LocalDate dataDeNascimento;

public Object getNome() {
    return null;
}

public Object getCpf() {
    return null;
}

public Object getDataDeNascimento() {
    return null;
}

public Object getBairro() {
    return null;
}
}
