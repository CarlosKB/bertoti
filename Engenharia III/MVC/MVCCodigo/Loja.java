import java.util.List;

public class Loja implements Subject{
  private List<Camiseta> camisetas;
  private List<Observer> observers;
  
  public void registerObserver(Observer o){
    this.observers.add(o);
  }
  
  public void notifyObservers(List<Camiseta> l){
    this.observers.stream().forEach(ob -> {
      System.out.println("Novas camisetas adicionadas:");
      l.stream().forEach(p -> {
        System.out.println(". " + p.getNome());
      });
    });
  }
  
  public void addBolo(Camiseta c){
    this.camisetas.add(c);
  }
 
  public Camiseta buscarCamiseta(String nome){
    return this.camisetas.stream().filter(r -> r.getNome().equalsIgnoreCase(nome)).findFirst().get();
  }
}
  