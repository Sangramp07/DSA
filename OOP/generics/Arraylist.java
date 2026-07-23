package OOP.generics;

public class Arraylist {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    // Constructor to initialize array
    public Arraylist() {
        data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        // copy the current data in new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    // Override toString() to print elements properly
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i < size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Arraylist list = new Arraylist();
        list.add(3);
        list.add(5);
        list.add(8);
        System.out.println(list); // prints [3, 5, 8]
    }
}
