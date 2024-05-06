public class MyThread extends Thread{
    public int i = 0;

    public void run(){
        for (int j = 0; j < 10; j++) {
            i++;
            System.out.println("IncrementThread " + i);
        }
    }
}
