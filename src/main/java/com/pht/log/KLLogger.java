package com.pht.log;


import java.util.logging.Level;

public class KLLogger {

    public static void main(String[] args) {
      NewLog log =   NewLog.getLogger(KLLogger.class);
      log.info("aasdas");

    }

}


enum DebugLevel {
    DEBUG, INFO, WARN, ERROR;
}
class NewLog implements LogInterface{
    private NewLog(){}
    private  static  int  outType =3;
    private static DebugLevel level= DebugLevel.DEBUG;
    private static  String className ;
    public  static void setLogLevel(DebugLevel deb){
        level= deb;
    }
    public static  void setOutType( int  Type){
       outType = Type;
    }
    public static  NewLog getLogger(Object obj){
        className  = obj.getClass().getSimpleName();
        return new NewLog();
    }

    @Override
    public void info(String msg) {
        if(level == DebugLevel.INFO||level == DebugLevel.DEBUG){
            System.out.println(className+msg);
        }
    }

    @Override
    public void warn(String msg) {
        if(level ==DebugLevel.WARN||level ==DebugLevel.INFO ||level == DebugLevel.DEBUG){
            System.out.println(className+msg);
        }
    }

    @Override
    public void error(String msg) {
        if(level ==DebugLevel.ERROR||level ==DebugLevel.WARN||level ==DebugLevel.INFO ||level == DebugLevel.DEBUG){
            System.out.println(className+msg);
        }
    }
}
class FileLogger implements LogInterface{
    @Override
    public void info(String msg) {

    }

    @Override
    public void warn(String msg) {

    }

    @Override
    public void error(String msg) {

    }
}
class ConsoleLogger implements LogInterface{
    @Override
    public void info(String msg) {

    }

    @Override
    public void warn(String msg) {

    }

    @Override
    public void error(String msg) {

    }
}
interface LogInterface {
     void info(String msg);
     void warn(String msg);
     void error(String msg);
}
