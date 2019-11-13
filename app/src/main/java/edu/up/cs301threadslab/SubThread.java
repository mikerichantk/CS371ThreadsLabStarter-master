package edu.up.cs301threadslab;

import android.content.Context;
import android.view.View;

public class SubThread extends Thread {
    private AnimationView myView;

    public SubThread(AnimationView v)
    {
        myView = v;
    }

    @Override
    public void run() {
        //throw new RuntimeException("Stub!");

        while(true){
            myView.postInvalidate();
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
