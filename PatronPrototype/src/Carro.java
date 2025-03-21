public class Carro implements Prototype {
    private String nombre;
    public int llantas;
    private float psi;

    public Carro(String nombre, int llantas, float psi){
        this.nombre = nombre;
        this.llantas = llantas;
        this.psi = psi;
    }
    public Carro clone(){
        return new Carro(nombre, llantas, psi);
    }

    @Override
    public String toString(){
        return "Carro(nombre="+nombre+")";
    }
}
