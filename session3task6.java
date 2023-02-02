import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class session3task6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // Adding values to list and set
        for (int i = 0; i < 10; i++) {
            list.add(i);
            set.add(i);
        }

        // Adding duplicate values to list and set
        list.add(3);
        set.add(3);

        // Printing values using enhanced for loop
        System.out.println("List elements: ");
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Set elements: ");
        for (int value : set) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Removing third value from list
        list.remove(2);

        // Printing remaining values using enhanced for loop
        System.out.println("Remaining List elements: ");
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Remaining Set elements: ");
        for (int value : set) {
            System.out.print(value + " ");
        }
    }
}

