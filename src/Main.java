public class Main {
    public static void main(String[] args) {
        TrialThread t1 = new TrialThread("Task 1");
        TrialThread t2 = new TrialThread("Task 2");

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
            System.out.println("Task 1 and 2 complete");
        }catch(InterruptedException e){
            System.out.println("Error 15");
        }
    }
}