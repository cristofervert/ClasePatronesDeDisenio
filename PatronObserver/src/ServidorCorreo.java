import java.util.ArrayList;

public class ServidorCorreo implements Sujeto{
    private ArrayList<Observador> empleados = new ArrayList<>();
    private String ultimoCorreo;

    @Override
    public void conectar(Observador observador){
        empleados.add(observador);
    }
    @Override
    public void desconectar(Observador observador){
        empleados.remove(observador);
    }
    @Override
    public void notificar(){
        for(Observador observador: empleados){
            observador.actualizar(ultimoCorreo);
        }
    }
    public void recibirCorreo(String correo){
        System.out.printf("Correo recibido: %s\n", correo);
        this.ultimoCorreo = correo;
        notificar();
    }
}
