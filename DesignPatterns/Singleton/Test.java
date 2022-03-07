/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Luchn1k
 */
public class Test {

    public static void main(String[] args) {

        long start_time = System.currentTimeMillis();
        Logger logger = Logger.getLoggerInstance("log_1.txt");
        long end_time = System.currentTimeMillis();
        System.out.println(logger + " Time taken " + (end_time - start_time));

        start_time = System.currentTimeMillis();
        Logger logger2 = Logger.getLoggerInstance("log_2.txt");
        end_time = System.currentTimeMillis();
        System.out.println(logger2 + " Time taken " + (end_time - start_time));

    }
}
