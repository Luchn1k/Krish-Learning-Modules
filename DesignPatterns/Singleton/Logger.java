/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Luchn1k
 */
public class Logger {
    private final String LOG_FILE_NAME;
    
    /* volatile key word is used to make sure thr changers made in one thrad imedeatly 
    reflects in other thread*/
    private static volatile Logger loggerInstance;
    
    private Logger(String logFileName){
        this.LOG_FILE_NAME = logFileName;
        if(loggerInstance != null){
            throw new RuntimeException("Use getLoggerInstance method");         
        }
    }
    public static Logger getLoggerInstance(String loggerFileName){
        if(loggerInstance == null){
            synchronized(Logger.class){
                if(loggerInstance == null){
                    loggerInstance = new Logger(loggerFileName);
                }
            }
        }
        return loggerInstance;
    }
    public void write(String data)throws IOException{
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(LOG_FILE_NAME)));
        out.write(data);
    }
    
}
