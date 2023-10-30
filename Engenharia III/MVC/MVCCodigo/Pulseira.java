public class Pulseira implements Acessorio {
    private View view;
    private Loja loja;

    public void ganharAcessorio() {
        System.out.println("Você ganhou um acessorio ao comprar uma camiseta!");
    }

  public void setView(View v){
    this.view = v;
  }
  
}