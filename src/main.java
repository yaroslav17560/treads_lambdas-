public class main {
    public static void main(String[] args) throws InterruptedException {

        class MyThread implements Runnable{
            @Override
            public void run() {
                System.out.println("thread is running");
                for(int i = 0;i < 100;i++){
                    System.out.println("i = " + i);
                }
                System.out.println("Thread is finished");
            }
        }

        Thread thread = new Thread(new MyThread());
        Thread thread1 = new Thread(new MyThread());
        thread.start();
        thread1.start();


    }
}
