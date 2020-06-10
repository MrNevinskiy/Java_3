package HW4;

public class main {
    public static void main(String[] args) {
        new Thread(new task('A', 'B')).start();
        new Thread(new task('B', 'C')).start();
        new Thread(new task('C', 'A')).start();
    }
}
