package edu.up.cs301threadslab;

import android.content.Context;
import android.view.View;

import java.util.Random;

public class StarThread extends Thread {
    private StarAnimation myView;

    public StarThread(StarAnimation v)
    {
        myView = v;
    }

    @Override
    public void run() {
        //throw new RuntimeException("Stub!");

        while(true){
            synchronized (myView) {
                try {
                    sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Random rand = new Random();
                int next = rand.nextInt(1);
                if (next == 1) {
                    myView.addStar();
                } else {
                    myView.removeStar();
                }

            }
        }
    }

}
