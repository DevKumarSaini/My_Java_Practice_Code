/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myjavaprograms;

/**
 *
 * @author Devsa
 */
public class forloopWithMultiThreading implements Runnable{
    public static void main(String [] args){
       forloopWithMultiThreading fg = new forloopWithMultiThreading();
        Thread th = new Thread(fg);
        th.run();
        
    }

    @Override
    public void run() {
        try{
            for(int i=0;i<10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
   
}
