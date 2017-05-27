package com.demo.javaHeap;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {

	static class OOMObject{
		public byte[] placeholder = new byte[64*1024];
	}
	
	public static void fillHeap(int num) throws InterruptedException{
		List<OOMObject> list = new ArrayList<OOMObject>();
		for(int i =0;i<num;i++)
		{
			Thread.sleep(50);
			list.add(new OOMObject());
		}
	}
	
	public static void main(String[] args) throws Exception {
//		List<OOMObject> list = new ArrayList<OOMObject>();
//		while(true){
//			list.add(new OOMObject());
//		}
		while(true){
		fillHeap(1000);
	}}

}
