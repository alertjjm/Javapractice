package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Runnable beepTask=new BeepTask();
        Thread thread=new Thread(beepTask);
        thread.start();
        for(int i=0; i<5; i++){
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
