public class FuncionarioTeste {
    public static void main(String[] args) {
        
        Gerente gerente = new Gerente("Carlos", 5000.0, 1500.0);
        System.out.println("Nome do Gerente: " + gerente.getNome());
        System.out.println("Salário do Gerente: R$ " + gerente.calcularSalario());

        
        Assistente assistente = new Assistente("Ana", 3000.0);
        System.out.println("\nNome do Assistente: " + assistente.getNome());
        System.out.println("Salário do Assistente: R$ " + assistente.calcularSalario());
    }
}
