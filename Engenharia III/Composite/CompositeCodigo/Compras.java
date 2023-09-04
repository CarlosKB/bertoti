import java.util.ArrayList;
import java.util.List;

public class Compras implements Produto {
  private List<Produto> produtos;
  private double valorTotalTotal;

  public Compras() {
    this.produtos = new ArrayList<>();
    this.valorTotal = 0.00;
  }

  @Override
  public void comprar() {
    System.out.println("Valor total das suas compras R$"+this.valorTotal);
  }

  @Override
  public double getvalorTotal(){
    return this.valorTotalTotal;
  }

  public void addProduto(Produto produto) {
    produtos.add(produto);
    this.valorTotal += produto.getvalorTotal();
  }

  public void delProduto(Produto produto) {
    produtos.remove(produto);
    this.valorTotal -= produto.getvalorTotal();
  }

  public List<Produto> getProdutos() {
    return produtos;
  }
}