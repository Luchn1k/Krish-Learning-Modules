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
public class Test {

    public static void main(String[] args) {
        TeslaFactory teslaFactory = new TeslaFactory();
        Car teslaModel3 = teslaFactory.getTesla(TeslaModel.Model3);
        teslaModel3.functionality();
        
        Car teslaModelX = teslaFactory.getTesla(TeslaModel.ModelX);
        teslaModelX.functionality();
        

    }

}
