import java.util.Collections;
import java.util.LinkedList;

public class TrialThread implements Runnable {

    private final String taskName;

    public TrialThread(String taskName) {
        this.taskName = taskName;
    }
    LinkedList<String> toPrintList = new LinkedList<>();

    @Override
    public void run() {
        if(taskName.equals("Task 1")){
            Collections.addAll(toPrintList, "1","2","3","4","5");

        } else if (taskName.equals("Task 2")) {
            try {
                Thread.sleep(10);
                Collections.addAll(toPrintList, "A", "B", "C", "D", "E");
            }catch (InterruptedException e){
                System.out.println("Error 0");
            }
        }
        else{
            System.out.println("Error with the tread name");
        }
        for(String s : toPrintList)try{
            Thread.sleep(1000);
            System.out.println(s);
        }catch (InterruptedException e){
            System.out.println("Error 1");
        }
    }
}
