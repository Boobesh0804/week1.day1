package week1.day1;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FibonacciSeries {

	public static void main(String[] args) {
		int r =8;
		int fstnum =0;
		int secnum=1;
		int sum;
      System.out.println(fstnum+ " "+ secnum);
      
      for(int i=1; i<=r-2;i++) {
    	  sum = fstnum+secnum;
    	  fstnum =secnum;
    	  secnum = sum;
    	  
    	  System.out.println(sum+" ");
      }
      
	}
}
