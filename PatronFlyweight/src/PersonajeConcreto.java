public class PersonajeConcreto implements Personaje{

    private String tipo;//
    public PersonajeConcreto(String tipo){
        this.tipo = tipo;
    }
    @Override
    public void mostrarPos(int[] pos){
        System.out.printf("Personaje %s -> (%d, %d)\n", tipo, pos[0], pos[1]);
    }
}
