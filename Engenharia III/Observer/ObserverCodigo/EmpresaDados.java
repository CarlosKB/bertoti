import java.util.ArrayList;
import java.util.List;

public class EmpresaDados {
    private List<Observer>:observers;
    private empresaNome:String
    private endereco:String
    
    public EmpresaDados(){
        this.observers = new ArrayList<>();
        this.empresaNome = String
        this.endereco = String
    }

    public void setEmpresaNome(String nome){
        this.empresaNome = nome
    }

    public void setEndereco(String endereco){
        this.endereco = endereco
    }
    
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }
    
    public void postEmpresaDados(String nome, String endereco){
        setEmpresaNome(nome)
        setEndereco(endereco)
        notify(nome, endereco)
    }

    public void notify(String nome, String endereco){
        this.observers.stream().forEach(item -> {
           item.update(nome, endereco) ;
        });
    }
    
}