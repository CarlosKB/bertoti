public class Camiseta{
    private String cor;
    private String nome;
    private double preco;
    
    public Camiseta(String nome, String cor, double preco){
      this.nome = nome;
      this.preco = preco;
      this.cor  =  cor;
    }
    
    public String getNome(){
      return this.nome;
    }

    public String getCor(){
      return this.cor;
    }

    public double getPreco(){
      return this.preco;
    }
    
}
