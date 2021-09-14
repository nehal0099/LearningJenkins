package com.mindtree.runner;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
		System.out.println(timeStamp);
	}

}
