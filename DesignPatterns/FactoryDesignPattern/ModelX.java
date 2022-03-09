/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDesignPattern;

/**
 *
 * @author Luchn1k
 */
public class ModelX implements Car{

    @Override
    public void functionality() {
        System.out.println("Model X is built from the ground up as an electric vehicle, "
                + "with a high-strength architecture and floor-mounted battery pack for incredible "
                + "occupant protection and low rollover risk. Every Model X includes Tesla's latest active safety features, such as Automatic Emergency Braking, at no extra cost.");
    }
    
}
