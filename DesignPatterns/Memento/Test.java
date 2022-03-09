/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

/**
 *
 * @author Luchn1k
 */
public class Test {
    public static void main(String[] args) {
        File file = new File();
        file.setData("This is the first line");
        file.save();
        System.out.println(file.getData());
        file.append(" This is appended but not saved");
        System.out.println(file.getData());
        file.undo();
        System.out.println("undo------------------------------------------------------------undo");
        System.out.println(file.getData());
    }
}
