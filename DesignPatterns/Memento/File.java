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
public class File {
    private String data;
    private final FileCaretaker caretaker = new FileCaretaker();

    public File() {

    }

    public File(String data) {
        this.data = data;
    }

    public void append(String s) {
        this.data += s;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void save() {
        caretaker.addMemento(new FileMemento(data));
    }

    public void undo() {
        FileMemento memento = caretaker.getMemento();
        if(memento != null) {
            setData(memento.getData());
        }
    }
}