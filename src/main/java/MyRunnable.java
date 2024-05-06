public class MyRunnable implements Runnable{
    private double number;

    public MyRunnable(double number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            number/=2;

            System.out.println("Divide Runnable " + number);
        }
    }
}
