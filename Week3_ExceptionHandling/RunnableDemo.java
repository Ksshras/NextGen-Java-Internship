class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyTask task = new MyTask();

        Thread t1 = new Thread(task, "Download Thread");
        Thread t2 = new Thread(task, "Music Thread");

        t1.start();
        t2.start();
    }
}
