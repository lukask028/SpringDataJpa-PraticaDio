package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AvaliacaoFisicaForm {

  private Long alunoId;

  private double peso;

  private double altura;

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public Object getPeso() {
    return null;
  }

public Long getAlunoId() {
    return null;
}


}

