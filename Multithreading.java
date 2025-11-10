class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Number: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class LetterThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println(Thread.currentThread().getName() + " - Letter: " + c);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Multithreading {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        LetterThread t2 = new LetterThread();

        t1.setName("NumbersThread");
        t2.setName("LettersThread");

        t1.start();
        t2.start();
    }
}