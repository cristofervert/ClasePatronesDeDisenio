public class Main {
    public static void main(String[] args) {
        System.out.println("Construccion de objetos");
        /*Computadora c = new Computadora("a","b","c",
               "d",8, new float[]{20,40,40}); */
        BuilderComputadora b = new BuilderComputadora();
        Computadora c = b.setProcesador("Intel i7").setTarjetaGrafica("RTX 5030").getComputadora();
        System.out.println(c.toString());
    }
}