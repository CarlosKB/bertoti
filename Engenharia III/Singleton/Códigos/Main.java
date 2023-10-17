    
    
    public class Main{
    public static void main(String[] args) {
        ContadorAcesso counter = ContadorAcesso.getInstance();

        counter.incrementCount();
        counter.incrementCount();
        counter.incrementCount();

        System.out.println("Número de acessos: " + counter.getCount());

    }
}