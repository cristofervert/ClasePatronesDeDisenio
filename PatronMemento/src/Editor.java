public class Editor {
    private String contenido;
    private Caretaker caretaker = new Caretaker();

    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public String getContenido(){
        return contenido;
    }
    public void guardar(){
        MementoEditor memento = new MementoEditor(contenido);
        caretaker.save(memento);
    }
    public void deshacer(){
        if(caretaker.mementoStack.isEmpty()){
            System.out.println("No hay nada para deshacer");
            return;
        }
        Memento memento = caretaker.restore();
        this.setContenido(memento.getContenido());
        System.out.println("Estado anterior restaurado");
    }
}
