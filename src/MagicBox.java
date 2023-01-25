import java.util.Random;

public class MagicBox <T> {
    protected T[] items;

    public MagicBox(int sizeMagicBox) {
        this.items = (T[]) new Object[sizeMagicBox];

    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println((i + 1) + "." + item);
                return true;
            }
        }
        System.out.println("Коробка полная");
        return false;
    }

    public T pick() {
        int length = items.length;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка еще не полная " + (length - i));
            }
        }
        Random random = new Random();
        int randomNumber = random.nextInt(length);
        System.out.println("Тебе выпало " + (randomNumber + 1));
        return null;

    }
}


