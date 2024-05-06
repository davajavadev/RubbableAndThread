public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        double number = 100;
        MyRunnable myRunnable = new MyRunnable(number);
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
