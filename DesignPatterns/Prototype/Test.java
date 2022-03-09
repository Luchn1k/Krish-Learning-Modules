/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Luchn1k
 */
public class Test {
    public static void main(String[] args) {
        Mobile s22 = new Mobile();
        s22.setColor("Black");
        s22.setDisplay("4k");
        s22.setMobileBrand("Samsung");
        s22.setMobileName("S22");
        s22.setNetwork("4g");
        System.out.println(s22);
        
        Mobile s22Gold = s22.clone();
        s22Gold.setColor("Gold");
        System.out.println(s22Gold);
        
        
        
        
    }
    
}
