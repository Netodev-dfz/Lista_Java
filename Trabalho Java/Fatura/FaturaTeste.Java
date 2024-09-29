public class FaturaTeste {
    public static void main(String[] args) {
        
        Fatura fatura = new Fatura("1234", "Mouse", 5, 25.99);

        
        System.out.println("Código do Produto: " + fatura.getCodigoProduto());
        System.out.println("Descrição do Produto: " + fatura.getDescricaoProduto());
        System.out.println("Quantidade Comprada: " + fatura.getQuantidadeComprada());
        System.out.println("Preço por Item: R$" + fatura.getPrecoPorItem());
        System.out.println("Total da Fatura: R$" + fatura.getTotalFatura());

        
        fatura.setQuantidadeComprada(-10);
        fatura.setPrecoPorItem(-50.0);
        System.out.println("\nApós definir quantidade e preço como negativos:");
        System.out.println("Quantidade Comprada: " + fatura.getQuantidadeComprada());
        System.out.println("Preço por Item: R$" + fatura.getPrecoPorItem());
        System.out.println("Total da Fatura: R$" + fatura.getTotalFatura());
    }
}
