public class Productor extends Thread {

    private ColaDeTareas ct;

    public Productor(ColaDeTareas ct) {
        this.ct = ct;
    }

    public void run() {
        ct.producir();
    }
}
