/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countdown;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Andres
 */
public class Countdown {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Date target = new Date(2017,8,30);
		Date today = new Date(System.currentTimeMillis());
		
		long countdown = target.getTime()-today.getTime();
		
//		System.out.println(divide(countdown));
//		System.out.println(divide(System.currentTimeMillis()));
//		System.out.println(" YRS   DAYS    HRS   MINS  SEGS   MILLS");
		
		DateFormat df = new SimpleDateFormat("dd:MM:yy:HH:mm:ss");
      
       //formatted value of current Date
       System.out.println("Milliseconds to Date: " + df.format(new Date(countdown)));
       System.out.println("Milliseconds to Date: " + df.format(today));


	}
	
	public static String divide(long time) {
		String result;
		
		double interval = (double) time;
		
//		MILLIS
		result = ""+interval%1000;
		interval = Math.floor(interval/1000);
		
//		SEGS
		result = interval%60+"   "+result;
		interval = Math.floor(interval/60);
		
//		MINS
		result = interval%60+"   "+result;
		interval = Math.floor(interval/60);
		
//		HRS
		result = interval%24+"   "+result;
		interval = Math.floor(interval/24);
		
//		DAYS
		result = interval%365+"   "+result;
		interval = Math.floor(interval/365);
		
//		YRS
		result = interval + "   " + result;
		
		return result;
	}
}
