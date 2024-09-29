public class Data {
    private int dia;
    private int mes;
    private int ano;

    
    public Data(int dia, int mes, int ano) {
        if (diaValido(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Data inválida");
        }
    }

    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (diaValido(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    
    public void displayData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    
    private boolean diaValido(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            return false;
        }
        if (mes == 2) { 
            if (anoBissexto(ano)) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { 
            return dia <= 30;
        }
        return true; 
    }

    
    private boolean anoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }
}
