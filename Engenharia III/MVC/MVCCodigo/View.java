import java.util.List;

public class View implements Observer{
  private Acessorio acessorio;
  private List<Camiseta> camisetas;
  
  public void setCafeGratis(Acessorio a){
    this.acessorio = a;
  }
  
  public void update(List<Camiseta> l){
    this.camisetas = l;
  }
  
}