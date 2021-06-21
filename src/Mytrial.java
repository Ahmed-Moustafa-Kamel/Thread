public class Mytrial implements Runnable {
    public Mytrial(String name) {
        this.name = name;
    }

    String name;

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(i+" "+name);

            }
        }

}
