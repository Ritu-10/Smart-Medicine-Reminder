// src/Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // medicines ko store karne ke liye list
        List<Medicine> medicines = new ArrayList<>();

        medicines.add(new Medicine("Paracetamol", "08:00 AM"));
        medicines.add(new Medicine("Vitamin C", "02:00 PM"));

        System.out.println("📋 Medicine Reminder App");
        System.out.println("-------------------------");

   // print all medicine
        for (Medicine m : medicines) {
            System.out.println(m);
        }

        medicines.get(0).markTaken();
        System.out.println("\nAfter marking first medicine as taken:");
        for (Medicine m : medicines) {
            System.out.println(m);
        }
    }
}
