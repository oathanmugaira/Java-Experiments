package skl_oopb2;
/*
 * Name :-Pathan Mugaira Zakeer
 * Div:-A Roll.no:-25 UIN:- 231P084
 * Aim:-Write a program to print alphabets and numbers using two threads. 
 */
class AlphabetThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(100); // Sleep to simulate alternating output
            } catch (InterruptedException e) {
               
            }
        }
    }
}

class NumberThread extends Thread {
    public void run() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(100); // Sleep to simulate alternating output
            } catch (InterruptedException e) {
              
            }
        }
    }
}

public class exp11C {
    public static void main(String[] args) {
        AlphabetThread alphabetThread = new AlphabetThread();
        NumberThread numberThread = new NumberThread();

        alphabetThread.start();
        numberThread.start();

        try {
            alphabetThread.join();
            numberThread.join();
        } catch (InterruptedException e) {
        }

        System.out.println(); // Print a new line after the output
    }
}