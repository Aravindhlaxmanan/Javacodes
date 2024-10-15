package nwknvghg;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("Task 1 started");
        performTask1();
        System.out.println("Task 1 completed");

        System.out.println("Task 2 started");
        performTask2();
        System.out.println("Task 2 completed");
    }

    private static void performTask1() {
        // Simulate task 1
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    private static void performTask2() {
        // Simulate task 2
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
