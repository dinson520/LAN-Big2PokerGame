package view;

import java.awt.*;
public class ViewTest1 {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                Big2GameView client2 = new Big2GameView("YD111","Q");

            }
        } );
}}
