class Task implements Runnable {
    private String taskName;

    Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " - Step " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println(taskName + " completed!");
    }
}

public class TaskSimulator {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Downloading File"));
        Thread t2 = new Thread(new Task("Playing Music"));
        Thread t3 = new Thread(new Task("Sending Notification"));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All tasks completed!");
    }
}
