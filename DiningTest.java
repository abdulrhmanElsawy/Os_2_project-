/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class DiningTest {
    public static void main(String[] args){
		
        Chopstick CH = new Chopstick();
            new Philosopher(CH).start();
            new Philosopher(CH).start();
            new Philosopher(CH).start();
            new Philosopher(CH).start();
            new Philosopher(CH).start();
           
       
            
             try { Thread.sleep(10000);
             } catch (InterruptedException e) {}
        

 
System.exit(0);
            
            
    }
}
