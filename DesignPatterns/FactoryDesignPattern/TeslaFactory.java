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
public class TeslaFactory {
    public Car getTesla(TeslaModel model){
        switch (model){
            case Model3:
               return new Model3();
            case ModelS:
                return new ModelS();
            case ModelX:
                return new ModelX();
            case ModelY:
                return new ModelY();
           default:
               return null;
                
        }
    }
}
