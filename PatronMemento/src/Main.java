public class Main {
    public static void main(String[] args) {
        System.out.println("Patron Memento");
        Editor editor = new Editor();
        editor.setContenido("Hola mundo");
        editor.guardar();
        editor.setContenido("bla bla bla");
        editor.guardar();
        editor.setContenido("sadfsdfsdfdsaf");
        editor.guardar();
        System.out.println(editor.getContenido());
        editor.deshacer();
        System.out.println(editor.getContenido());
        editor.deshacer();
        System.out.println(editor.getContenido());

    }
}