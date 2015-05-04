package com.ibm.wala.util.heapTrace;
 import java.lang.reflect.*;
 import java.io.*;
 import java.text.*;
import java.util.*;

public class LoggerImpl implements MyLogger  {
	
	
    public void logRecord( String message, int logRecordType ) {
    	try{
	    logMessage( message,logRecordType,(new Throwable()).getStackTrace()[1]);
		}
    	catch(IOException w){}
    }
    public void logProblem( Throwable t ) {
    	try{
		logMessage(t.toString(),ERROR,(new Throwable()).getStackTrace()[1]);
		}
    	catch(IOException e){}
    }
	public void logMessage( String message,int logRecordType,StackTraceElement ste )throws IOException
		{
		try{
		String callerClassName = ste.getClassName();
		String callerMethodName = ste.getMethodName();
		int callerLineNum = ste.getLineNumber();
		boolean nativeM  =ste.isNativeMethod();
		BufferedWriter out = new BufferedWriter(new FileWriter("log.txt",true));
        out.newLine();
		out.write("\n"+"nativity"+nativeM+"type of log "+logRecordType+"class " + callerClassName+" method "+callerMethodName+" line "+callerLineNum+"\n");
        out.close();
		}
		catch(IOException e){}
	   
		// write of log record goes here
		}
}
