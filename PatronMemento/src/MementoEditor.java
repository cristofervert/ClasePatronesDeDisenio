public class MementoEditor implements Memento{
    private final String contenido;
    public MementoEditor(String contenido){
        this.contenido = contenido;
    }
    public String getContenido(){
        return contenido;
    }
}
