public class Main {
    public static void main(String[] args) {
        MyThread th = new MyThread(" thread1");
        th.start();
        MyThread th2 = new MyThread("thread 2");
        th2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("hi from main");
        }
        Mytrial tr=new Mytrial("mytrial");
        tr.run();
        Thread tr1= new Thread(tr);
        tr1.start();

    }
}
