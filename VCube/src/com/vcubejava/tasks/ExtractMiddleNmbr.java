package com.vcubejava.tasks;


public class ExtractMiddleNmbr {

	//display middle nmbr.
	int nmbr=123;
	int fd;
	int md;
	int updatednmbr;
	public static void main(String[] args) {
		
		ExtractMiddleNmbr m = new ExtractMiddleNmbr();

		m.fd=m.nmbr/100;
		
		System.out.println(m.fd);
		
		m.updatednmbr=(m.nmbr)%100;
		System.out.println("updated nmbr "+m.updatednmbr);
		
		m.md = (m.updatednmbr)/10;
		
		System.out.println(m.md);
		
		
	}

}
