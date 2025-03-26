public class AdaptadorImpresora implements Impresora {
    private ImpresoraVieja imp;

    public AdaptadorImpresora(ImpresoraVieja imp) {
        this.imp = imp;
    }

    @Override
    public void print(){
        imp.imprimir();
    }
}
