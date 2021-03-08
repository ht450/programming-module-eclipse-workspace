package challenge1;

public class Q9Threader implements Runnable {

    @Override
    public void run() {
        for (int loop=0;loop<100;loop++) {
            System.out.println(loop);
       }
    }
}
