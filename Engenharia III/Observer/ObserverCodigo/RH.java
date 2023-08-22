public class RH implements Observer {

    public void update(String nome, String endereco){
        System.out.println('O nome da empresa é: '+nome+'e o endereço: ',endereco)
    }
}