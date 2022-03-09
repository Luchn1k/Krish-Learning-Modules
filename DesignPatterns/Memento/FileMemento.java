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
public class FileMemento {
    private final String data;

    FileMemento(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
