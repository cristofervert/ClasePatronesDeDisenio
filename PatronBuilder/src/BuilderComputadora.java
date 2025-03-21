public class BuilderComputadora {

    private String procesador;
    private String tarjetaGrafica;
    private String fuenteDePoder;
    private String tarjetaMadre;
    private int ram;
    private float[] gabinete;

    public BuilderComputadora setProcesador(String procesador){
        this.procesador = procesador;
        return this;
    }
    public BuilderComputadora setTarjetaGrafica(String tarjetaGrafica){
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }
    public BuilderComputadora setFuenteDePoder(String fuenteDePoder){
        this.fuenteDePoder = fuenteDePoder;
        return this;
    }
    public BuilderComputadora setTarjetaMadre(String tarjetaMadre){
        this.tarjetaMadre = tarjetaMadre;
        return this;
    }
    public BuilderComputadora setRam(int ram){
        this.ram = ram;
        return this;
    }
    public BuilderComputadora setGabinete(float[] gabinete){
        this.gabinete = gabinete;
        return this;
    }

    public Computadora getComputadora(){
        return new Computadora(procesador, tarjetaGrafica,
                                fuenteDePoder, tarjetaMadre,
                                ram, gabinete);
    }
}
