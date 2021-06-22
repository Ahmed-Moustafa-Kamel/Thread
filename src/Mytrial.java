public class Mytrial implements Runnable {
    public Mytrial(String name) {
        this.name = name;
    }

    String name;

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(i+" "+name);
            try {
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done"+name);
    }

}
