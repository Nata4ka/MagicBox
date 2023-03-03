import java.util.Random;

public class MagicBox<T> {
    public int amount;
    public T[] items;

    public MagicBox(int amount) {
        this.amount = amount;
        this.items = (T[]) new Object[amount];
    }

    public boolean add(T item) {
        for (int i = 0; i < amount; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;

    }

    public T pick() {
        int cells = 0;
        for (int i = 0; i < amount; i++) {
            if (items[i] == null) {
                cells++;
            }
        }
        if (cells != 0) {
            throw new RuntimeException("Магическая коробка не полна, осталось заполнить" + cells + "ячеек.");
        }
        return items[random()];
    }
    public int random() {
        Random random = new Random();
        int randomInt = random.nextInt(amount);
        return randomInt;
    }

}