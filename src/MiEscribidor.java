package proyecto;
public class MiEscribidor extends Thread{
    int x;
    public  MiEscribidor(int x) {
        this.x=x;
    }
    public void run (){

            for (int i = 0; i < 10; i++) {
                System.out.println("Soy el número " + x);
            }

    }
}
