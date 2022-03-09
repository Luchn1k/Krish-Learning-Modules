/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain;

/**
 *
 * @author Luchn1k
 */
abstract class Request {
    protected Request request;

    public void setNext(Request request){
        this.request = request;
    }
    public abstract void validate(Data data);
}
