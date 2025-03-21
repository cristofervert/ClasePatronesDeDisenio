public class Computadora {

    private String procesador;
    private String tarjetaGrafica;
    private String fuenteDePoder;
    private String tarjetaMadre;
    private int ram;
    private float[] gabinete;

    public Computadora(
            String procesador,
            String tarjetaGrafica,
            String fuenteDePoder,
            String tarjetaMadre,
            int ram,
            float[] gabinete
    ){
        this.tarjetaGrafica = tarjetaGrafica;
        this.tarjetaMadre = tarjetaMadre;
        this.procesador = procesador;
        this.ram = ram;
        this.fuenteDePoder = fuenteDePoder;
        this.gabinete = gabinete;
    }
    @Override
    public String toString(){
        return "Computadora(tarjetaGrafica="+tarjetaGrafica+
                ",tarjetaMadre="+tarjetaMadre+
                ",procesador="+procesador+
                ",ram="+String.valueOf(ram)+")";

    }


}
