package skl_oopb2;
/*
 * Name :-Pathan Mugaira Zakeer
 * Div:-A Roll.no:-25 UIN:- 231P084
 * Aim:-Write a program to print / * / * / * / */   
 //using two child thread.

class StarThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) { }
        }
    }
}

class SlashThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print("/");
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) { }
        }
    }
}

public class exp11B {
    public static void main(String[] args) {
        StarThread starThread = new StarThread();
        SlashThread slashThread = new SlashThread();

        starThread.start();
        slashThread.start();

        try {
            starThread.join();
            slashThread.join();
        } catch (InterruptedException e) { }

        System.out.println(); 
    }
}