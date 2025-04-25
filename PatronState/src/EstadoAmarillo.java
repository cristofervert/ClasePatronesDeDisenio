public class EstadoAmarillo implements Estado{
    @Override
    public void cambiar(Semaforo semaforo){
        System.out.println("Color amarillo\tDesacelerar");
        semaforo.establecerEstado(new EstadoRojo());
    }
}