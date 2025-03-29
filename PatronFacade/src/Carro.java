public class Carro {
    private Motor motor;
    private Alternador alternador;
    private Luces luces;

    public Carro(Motor motor, Alternador alternador, Luces luces){
        this.motor = motor;
        this.alternador = alternador;
        this.luces = luces;
    }

    public void iniciarCarro(){
        System.out.println("Iniciando carro");
        motor.prender();
        alternador.encender();
        luces.encender();
    }
    public void detenerCarro(){
        motor.apagar();
        alternador.apagar();
        luces.apagar();
        System.out.println("Carro detenido");
    }
}
