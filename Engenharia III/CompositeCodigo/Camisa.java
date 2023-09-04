public class Camisa implements Produto {
  private String tamanho;
  private String nome;
  private double valor;

  public Camisa(String tamanho, String nome, double valor) {
    this.tamanho = tamanho;
    this.nome = nome;
    this.valor = valor;
  }

public void setCamisa(String tamanho, Double valor, String nome){
    this.tamanho = tamanho
    this.nome = nome
    this.valor = valor
}

  public double getValor() {
    return this.valor;
  }

  @Override
  public void comprar() {
      System.out.println("Comprando a camisa " + this.nome + "valor:  " + this.valor);
  }
}