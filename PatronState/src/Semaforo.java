public class Semaforo {
    private Estado estadoActual;

    public Semaforo(){
        this.estadoActual = new EstadoRojo();
    }
    public void establecerEstado(Estado estado){
        this.estadoActual = estado;
    }
   public void cambiar(){
        estadoActual.cambiar(this);
   }
}
