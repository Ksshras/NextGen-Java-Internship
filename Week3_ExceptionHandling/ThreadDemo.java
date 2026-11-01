class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
