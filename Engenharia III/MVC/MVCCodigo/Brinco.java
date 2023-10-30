public class Brinco implements Acessorio{
  private View view;
  private Loja loja;
  
  public void ganharAcessorio(){
    System.out.println("Você ganhou um brinco ao comprar uma camiseta!");
  }
  
  public void setView(View v){
    this.view = v;
  }
  
}