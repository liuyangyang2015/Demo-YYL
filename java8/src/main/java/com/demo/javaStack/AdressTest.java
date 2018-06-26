package com.demo.javaStack;

public class AdressTest
{

	public static void main(String[] args) {
		 int[] instr = new int[] { 1, 2, 3, 4, 5, 5 };
	     System.out.println(instr);
	     System.out.println(instr.toString()+" "+Integer.toHexString(instr.hashCode()));
         System.out.println(instr.getClass()+"@"+instr.hashCode());
         System.out.println(instr.getClass().getName() + "@" + Integer.toHexString(instr.hashCode()));
	     
         String a = new String("m");
         System.out.println(a.hashCode());
         System.out.println(a.getClass()+"@"+a.hashCode());
         System.out.println( a.getClass().getName() + "@" + Integer.toHexString(a.hashCode()));
         
	     Object a2  = new Object();
         System.out.println(a2.toString());   
         
         String[] str = new String[] { "1", "2", "3", "4", "5", "5" };
	     System.out.println(str);
	     System.out.println(str.toString()+" "+Integer.toHexString(str.hashCode()));
         System.out.println(str.getClass()+"@"+str.hashCode());
         System.out.println(str.getClass().getName() + "@" + Integer.toHexString(str.hashCode()));
	}

}
