
public class InteiroSetTeste {
    public static void main(String[] args) {
        
        InteiroSet conjunto1 = new InteiroSet();
        InteiroSet conjunto2 = new InteiroSet();

        
        conjunto1.insereElemento(10);
        conjunto1.insereElemento(20);
        conjunto1.insereElemento(30);
        conjunto1.insereElemento(40);

        
        conjunto2.insereElemento(30);
        conjunto2.insereElemento(40);
        conjunto2.insereElemento(50);
        conjunto2.insereElemento(60);

        
        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());

        
        InteiroSet uniao = conjunto1.union(conjunto2);
        System.out.println("União dos conjuntos: " + uniao.toSetString());

        
        InteiroSet intersecao = conjunto1.intersecao(conjunto2);
        System.out.println("Interseção dos conjuntos: " + intersecao.toSetString());

        
        boolean saoIguais = conjunto1.ehIgualTo(conjunto2);
        System.out.println("Os conjuntos são iguais? " + (saoIguais ? "Sim" : "Não"));

        
        conjunto2.insereElemento(10);
        conjunto2.insereElemento(20);

        System.out.println("Conjunto 2 após inserções: " + conjunto2.toSetString());
        saoIguais = conjunto1.ehIgualTo(conjunto2);
        System.out.println("Os conjuntos são iguais após inserções? " + (saoIguais ? "Sim" : "Não"));
    }
}
