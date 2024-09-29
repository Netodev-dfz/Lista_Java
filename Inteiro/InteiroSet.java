public class InteiroSet {
    private boolean[] conjunto; 

   
    public InteiroSet() {
        conjunto = new boolean[101]; 
    }

    
    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        } else {
            System.out.println("Elemento fora do intervalo (0-100)");
        }
    }

    
    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        } else {
            System.out.println("Elemento fora do intervalo (0-100)");
        }
    }

    
    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet uniao = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] || outroConjunto.conjunto[i]) {
                uniao.conjunto[i] = true;
            }
        }
        return uniao;
    }

    
    public InteiroSet intersecao(InteiroSet outroConjunto) {
        InteiroSet intersecao = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] && outroConjunto.conjunto[i]) {
                intersecao.conjunto[i] = true;
            }
        }
        return intersecao;
    }

    
    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }

    
    public String toSetString() {
        StringBuilder elementos = new StringBuilder();
        for (int i = 0; i <= 100; i++) {
            if (conjunto[i]) {
                elementos.append(i).append(" ");
            }
        }
        return elementos.length() > 0 ? elementos.toString().trim() : "-";
    }
}
