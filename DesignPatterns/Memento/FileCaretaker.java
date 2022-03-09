/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import java.util.Stack;

/**
 *
 * @author Luchn1k
 */
class FileCaretaker {
    private final Stack<FileMemento> FILE_LIST = new Stack();

    public void addMemento(FileMemento memento) {
        FILE_LIST.push(memento);
    }

    public FileMemento getMemento() {
        if(!FILE_LIST.isEmpty()) {
            return FILE_LIST.pop();
        }
        return null;
    }
}
