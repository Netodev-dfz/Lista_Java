public class EmpregadoTeste {
    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado("João", "Silva", 3000);
        Empregado empregado2 = new Empregado("Maria", "Santos", 4000);

        
        System.out.println("Salário anual do empregado 1: R$ " + empregado1.getSalarioAnual());
        System.out.println("Salário anual do empregado 2: R$ " + empregado2.getSalarioAnual());

        
        empregado1.aplicarAumento(10);
        empregado2.aplicarAumento(10);

        
        System.out.println("Novo salário anual do empregado 1 após aumento: R$ " + empregado1.getSalarioAnual());
        System.out.println("Novo salário anual do empregado 2 após aumento: R$ " + empregado2.getSalarioAnual());
    }
}
