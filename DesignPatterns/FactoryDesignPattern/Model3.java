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
public class Model3 implements Car{

    @Override
    public void functionality() {
        System.out.println("Model 3 is that it's simply a compelling electric car. It really offers everything one would need,"
                + " starting with good range and high efficiency of the SR+ version, "
                + "strong acceleration, attractive look, tons of features and support of an outstanding Tesla Supercharging network");
    }
    
}
