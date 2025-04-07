public class Arbol {
    private Nodo raiz;

    public void agregar(int valor){
        raiz = agregarRec(raiz,valor);
    }
    private Nodo agregarRec(Nodo n, int valor){
        if(n == null){
            n = new Nodo(valor);
            return n;
        }
        if(n.valor > valor){
            n.r = agregarRec(n.r, valor);
        }
        else if(n.valor < valor){
            n.l = agregarRec(n.l, valor);
        }
        return n;
    }
    public void ver(){
        verRec(raiz);
    }
    public void verRec(Nodo n){
        if(n != null){
            verRec(n.l);
            System.out.printf(" %d ",n.valor);
            verRec(n.r);
        }
    }
}
