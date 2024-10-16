public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TrialThread("Task 1"));
        Thread t2 = new Thread(new TrialThread("Task 2"));

        t1.start();
        t2.start();

    }
}