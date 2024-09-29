public class Fatura {
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidadeComprada;
    private double precoPorItem;

    
    public Fatura(String codigoProduto, String descricaoProduto, int quantidadeComprada, double precoPorItem) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        setQuantidadeComprada(quantidadeComprada); 
        setPrecoPorItem(precoPorItem);             
    }

   
    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0; 
        }
    }

    
    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem > 0) {
            this.precoPorItem = precoPorItem;
        } else {
            this.precoPorItem = 0.0; 
        }
    }

    
    public double getTotalFatura() {
        return quantidadeComprada * precoPorItem;
    }
}
