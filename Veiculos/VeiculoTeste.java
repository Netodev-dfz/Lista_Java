public class VeiculoTeste {
    public static void main(String[] args) {
        
        Veiculo veiculo = new Veiculo("Ferrari", "Ferrari F8", 2020);
        System.out.println("Detalhes do Veículo:");
        veiculo.exibirDetalhes();

       
        Carro carro = new Carro("Toyota", "Corolla", 2021, 4);
        System.out.println("\nDetalhes do Carro:");
        carro.exibirDetalhes();

        
        Moto moto = new Moto("Honda", "XRE 190", 2025, "Esportivo");
        System.out.println("\nDetalhes da Moto:");
        moto.exibirDetalhes();
    }
}
