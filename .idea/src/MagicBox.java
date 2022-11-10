import java.util.Random;

public class MagicBox<T> {


    protected T[] items;

    public MagicBox(int size) {
        items = (T[]) new Object[size];

    }

    public boolean add(T item) {


        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = (T) item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {

                throw new RuntimeException(String.format("Коробка не полна, осталось заполнить " + (items.length - i)
                        + " ячеек"));

            }
        }
        Random random = new Random();
        // int randomInt = random.nextInt(items.length); // джава подберёт случайное число от 0 до ЧИСЛО невключительно
        return items[random.nextInt(items.length)];


    }
}
















