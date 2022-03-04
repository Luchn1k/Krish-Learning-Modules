/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

/**
 *
 * @author Luchn1k
 */
public class Test {
    public static void main(String[] args) {
        Message.MessageBuilder messageBuilder = new Message.MessageBuilder("This is test Message 01");
        Message message = messageBuilder.build();
        System.out.println(message);
        
        System.out.println("----------------------------------------------");
        message = messageBuilder.textColor("red").textSize("15 px").build();
        System.out.println(message);
        
    }
}
