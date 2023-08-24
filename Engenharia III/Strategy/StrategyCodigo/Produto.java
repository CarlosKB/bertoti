public class Produto {
   
    private String produtoDescricao;
    private TipoTransporte tipoTransporte;
    
    public Produto(String descricao,TipoTransporte tipoTransporte){
        this.produtoDescricao = descricao;
        this.tipoTransporte = tipoTransporte;
    }

    public String getProdutoDescricao() {
        return produtoDescricao;
    }
    
    public void transportar(){
        tipoTransporte.transportar();
    }
    
    public void setTipoTransporte(TipoTransporte tipoTransporte){
        this.tipoTransporte = tipoTransporte;
    }
}