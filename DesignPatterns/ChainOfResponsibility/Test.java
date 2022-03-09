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
public class Test {
     public static void main(String[] args) {
        Filter1 filter1 = new Filter1();
        Filter2 filter2 = new Filter2();
        Filter3 filter3 = new Filter3();

        Data data = new Data("www.test.com/a.jsp","username=abc&password=123");
        filter1.setNext(filter2);
        filter2.setNext(filter3);
        filter1.validate(data);

    }
}
