public class Mthread_with_Thread {




        public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public synchronized void run() {
                System.out.println("thread is running");
                for(int i = 0;i < 10;i++){
                    System.out.println("i = " + i);
                }
                System.out.println("thread is finished");
        }
        MyThread thread = new MyThread();
        MyThread thread1 = new MyThread();

        thread1.start();
        thread.start();


        }
    }
}
