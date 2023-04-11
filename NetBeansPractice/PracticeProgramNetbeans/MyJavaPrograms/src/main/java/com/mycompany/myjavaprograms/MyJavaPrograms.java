/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myjavaprograms;

/**
 *
 * @author Devsa
 */
public class MyJavaPrograms extends Thread{
    @Override
    public void run(){
        for (int i=0;i<100;i++){
        System.out.print("Printing Thread --> "+i);
    }
    }
    public static void main(String[] args) {
        MyJavaPrograms t = new MyJavaPrograms();
        t.start();
        for(int i=0;i<100;i++){
        System.out.println("Namestae Duniya  -->  "+i);
    }}
}
