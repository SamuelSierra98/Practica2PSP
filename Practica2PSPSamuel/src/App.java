public class App {
    public static void main(String[] args) {
        ColaDeTareas ct = new ColaDeTareas();

        for (int i = 0; i < 10; i++) {
            new Consumidor(ct).start();
            new Productor(ct).start();
        }
    }
}