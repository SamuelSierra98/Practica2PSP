public class Consumidor extends Thread {

    private ColaDeTareas ct;

    public Consumidor(ColaDeTareas ct) {
        this.ct = ct;
    }

    public void run() {
        ct.consumir();
    }
}
