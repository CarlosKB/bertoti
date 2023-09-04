public class Acessorio implements Produto {
  private String material;
  private String nome;
  private double valor;

  public Acessorio(String material, String nome, double valor) {
    this.material = material;
    this.nome = nome;
    this.valor = valor;
  }

public void setAcessorio(String material, Double valor, String nome){
    this.material = material
    this.nome = nome
    this.valor = valor
}

  public double getValor() {
    return this.valor;
  }

  @Override
  public void comprar() {
      System.out.println("Comprando o acessorio " + this.nome + "valor:  " + this.valor);
  }
}