// src/ReminderService.java
import java.util.PriorityQueue;

public class ReminderService {
    private PriorityQueue<Medicine> queue;

    public ReminderService() {
        // PriorityQueue me medicines time ke hisaab se sort hongi
        queue = new PriorityQueue<>((m1, m2) -> m1.getTime().compareTo(m2.getTime()));
    }

    public void addMedicine(Medicine med) {
        queue.add(med);
    }

    public Medicine getNextReminder() {
        return queue.peek(); // sabse pehle wali medicine
    }

    public void markMedicineTaken() {
        if (!queue.isEmpty()) {
            Medicine med = queue.poll();
            med.markTaken();
            System.out.println(med.getName() + " is taken ");
        }
    }

    public boolean hasReminders() {
        return !queue.isEmpty();
    }
}
