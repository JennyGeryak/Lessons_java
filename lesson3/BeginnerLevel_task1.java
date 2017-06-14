package lesson3;

import java.util.ArrayList;

/**
 * Created by geryak on 14.06.2017.
 * java
 */
public class BeginnerLevel_task1 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();

        for (int i = 0; i < 10; ++i) {
            x.add(i);
        }

        print(x);
        multiply(x, 3);
        print(x);
    }

    private static void multiply(ArrayList<Integer> list, int k) {
        for (int i = 0; i < list.size(); ++i) {
            list.set(i, list.get(i) * k);
        }
    }

    private static void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); ++i) {
            System.out.printf("%d ", list.get(i));
        }
        System.out.println();
    }

}
