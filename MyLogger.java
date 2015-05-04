package com.ibm.wala.util.heapTrace;

public interface MyLogger {
	
	
	public static final int ERROR = 0;
	public static final int WARNING = 100;
	public static final int STATUS = 200;
	public static final int DEBUG = 300;
	public static final int TRACE = 400;
	void logRecord( String message, int logRecordType );
	void logProblem( Throwable problem );
	
		}


