public class Moto extends Veiculo {
    private String tipoDeGuidon;

    
    public Moto(String marca, String modelo, int ano, String tipoDeGuidon) {
        super(marca, modelo, ano); 
        this.tipoDeGuidon = tipoDeGuidon;
    }

    
    public String getTipoDeGuidon() {
        return tipoDeGuidon;
    }

    public void setTipoDeGuidon(String tipoDeGuidon) {
        this.tipoDeGuidon = tipoDeGuidon;
    }

   
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("Tipo de guidão: " + tipoDeGuidon);
    }
}
