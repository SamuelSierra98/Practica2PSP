import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ColaDeTareas {
    private List<Integer> lista;

    public ColaDeTareas() {
        lista = new ArrayList<>();
    }

    public synchronized void producir() {
        while (lista.size() == 10) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        lista.add(new Random().nextInt(100));
        System.out.println("p " + lista.get(lista.size() - 1));
        notifyAll();
    }

    public synchronized void consumir() {
        while (lista.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println("c " + lista.get(0));
        lista.remove(0);
        notifyAll();

    }

    public List <Integer> verLista() {
        return lista;
    }
}