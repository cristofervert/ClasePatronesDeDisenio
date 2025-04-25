public class EstadoVerde implements Estado{
    @Override
    public void cambiar(Semaforo semaforo){
        System.out.println("Color verde\tAvance");
        semaforo.establecerEstado(new EstadoAmarillo());
    }
}