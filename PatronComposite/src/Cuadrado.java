public class Cuadrado implements Figura{
    private String color;
    public Cuadrado(String color){
        this.color = color;
    }
    @Override
    public void dibujar(){
        System.out.printf("Dibujando cuadrado de color %s\n",color);
    }
}
