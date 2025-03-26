
public class Main {

    private Imagen imagen;
    private Audio audio;

    private Main(AbstractFactory factory){
        imagen = factory.procesarImagen();
        audio = factory.procesarAudio();
    }
    private void abrir(){
        imagen.open();
        audio.open();
    }
    public static void main(String[] args) {
        System.out.println("Abstract factory");
        WindowsFactory factory  = new WindowsFactory();
        Main app = new Main(factory);
        app.abrir();
    }
}