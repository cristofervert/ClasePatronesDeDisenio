public class Circulo implements Figura{
    private String color;
    public Circulo(String color){
        this.color = color;
    }
    @Override
    public void dibujar(){
        System.out.printf("Dibujando circulo de color %s\n",color);
    }
}
