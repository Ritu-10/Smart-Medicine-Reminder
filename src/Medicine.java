// src/Medicine.java
public class Medicine {
    private String name;
    private String time;   // simple string formate (ex- 8.00 am)
    private boolean taken; // true = taken, false = not taken

    public Medicine(String name, String time) {
        this.name = name;
        this.time = time;
        this.taken = false;
    }

    public String getName() { return name; }
    public String getTime() { return time; }
    public boolean isTaken() { return taken; }

    // medicine ko taken mark karne ka method
    public void markTaken() {
        this.taken = true;
    }

    @Override
    public String toString() {
        return name + " at " + time + " | Taken: " + (taken ? "Yes" : "No");
    }
}
