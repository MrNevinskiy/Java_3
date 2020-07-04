package HW4;

public class task implements Runnable {

    private char currentlyChar;
    private char nextChar;

    private static final int lap = 10;
    private static Object monitor = new Object();
    private static volatile char charA = 'A';

    public task(char currentlyChar, char nextChar) {
        this.currentlyChar = currentlyChar;
        this.nextChar = nextChar;
    }

    @Override
    public void run() {
        for (int i = 0; i < lap; i++) {
            synchronized (monitor){
                try {
                    while (charA != currentlyChar)
                        monitor.wait();
                    System.out.print(currentlyChar);
                    charA = nextChar;
                    monitor.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
