package com.ibm.wala.util.heapTrace;
import java.lang.reflect.*;
import java.lang.reflect.Constructor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectHeapTracer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			      
			      Class cl = Class.forName("com.ibm.wala.util.heapTrace.HeapTracer");

			     
			      Constructor ctorlist[] = cl.getConstructors();

			      
			      Field fieldlist[] = cl.getDeclaredFields();

			      
			      Method methlist[] = cl.getMethods();
			      System.out.println("Name of the Constructors of the HeapTracer class");

			      
			    	  for (int i = 0; i < ctorlist.length; i++) {
			               Constructor ct = ctorlist[i];
			               System.out.println("~~~~~~~~~~");
			               System.out.println("name  = " + ct.getName());
			               System.out.println("decl class = " + ct.getDeclaringClass());
			               Class pvec[] = ct.getParameterTypes();
			               for (int j = 0; j < pvec.length; j++)
			                  System.out.println("parameter#" + j + " " + pvec[j]);
			               Class evec[] = ct.getExceptionTypes();
			               for (int j = 0; j < evec.length; j++)
			                  System.out.println("exception #" + j + " " + evec[j]);
			               System.out.println("~~~~~~~~~~~~");
			            }

			       
			      System.out.println("Name of the Declared fields ");

			  
			      for (int i= 0; i < fieldlist.length; i++) {
			                 Field fld = fieldlist[i];
			                 System.out.println("name = " + fld.getName());
			                 System.out.println("decl class = "+ fld.getDeclaringClass());
			                 System.out.println("type  = " + fld.getType());
			                 int mod = fld.getModifiers();
			                 System.out.println("modifiers = " + Modifier.toString(mod));
			                 System.out.println("-----");

			      }

			      System.out.println("Name of the Methods");

			      for (int i = 0; i < methlist.length;i++) {  
	               Method m = methlist[i];
	               System.out.println("name = " + m.getName());
	               System.out.println("decl class = " +m.getDeclaringClass());
	               Class pvec[] = m.getParameterTypes();
	               for (int j = 0; j < pvec.length; j++)
	                  System.out.println("parameter #" + j + " " + pvec[j]);
	               Class evec[] = m.getExceptionTypes();
	               for (int j = 0; j < evec.length; j++)
	                  System.out.println("exc #" + j + " " + evec[j]);
	               System.out.println("return type = " +m.getReturnType());
	               System.out.println("-----");


			    }} catch (ClassNotFoundException e) {
			      e.printStackTrace();
			    }
			  }
		// 

	}


