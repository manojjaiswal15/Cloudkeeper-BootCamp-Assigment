import java.util.*;

class SharedData{
    Queue<Integer> sharedBuffer = new LinkedList<>();
    boolean shared=true;

    synchronized void Consumer() throws InterruptedException {
        while (shared && !sharedBuffer.isEmpty()) {
            System.out.println("Consume = " + sharedBuffer.poll());
        }
         if(sharedBuffer.isEmpty()){
             shared=false;
             notifyAll();
             wait();
         }
    }

    synchronized void Producer() throws InterruptedException {
        while (!shared && sharedBuffer.size() < 5) {
            for (int i = 0; i < 5; i++) {
                sharedBuffer.add(i);
                System.out.println("Produces = " + i);
            }
        }
        if(sharedBuffer.size()==5){
            shared=true;
            notifyAll();
            wait();
        }
    }
}

public class ProductAndConsumer {
    public static void main(String[] args) {
        SharedData sd = new SharedData();

        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    sd.Consumer();
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {}
        });

        Thread producerThread = new Thread(() -> {
            try {
                while (true) {
                    sd.Producer();
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {}
        });

        consumerThread.start();
        producerThread.start();
    }
}
