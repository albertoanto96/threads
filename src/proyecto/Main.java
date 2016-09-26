package proyecto;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread th = new proyecto.MiEscribidor(i);
            th.start();

        }
    }
}
