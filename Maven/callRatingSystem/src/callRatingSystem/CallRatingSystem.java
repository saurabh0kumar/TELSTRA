package callRatingSystem;

import java.util.Scanner;

public class CallRatingSystem {
	//length of input
	public static int len = 5;
	
	//main driver method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] callDurations = new int[len];
		double[] callQualities = new double[len];
		
		for(int i=0;i<len;i++) {
			callDurations[i] = sc.nextInt();
		}
		for(int i=0;i<len;i++) {
			callQualities[i] = sc.nextDouble();
		}
		
		rateCalls(callDurations,callQualities);
	}
	
	//calculating rate score and then rate category
	public static void rateCalls(int[] callDurations, double[] callQualities) {
		double[] ratingScore = new double[len];
		String [] rateCategory = new String[len];
		for(int i=0;i<len;i++)
		{
			ratingScore[i] = callQualities[i]/callDurations[i];
			
			if(ratingScore[i]>=0.08) {
				rateCategory[i] = "Excellent";
			}
			else if(ratingScore[i]>=0.05 && ratingScore[i]<=0.08) {
				rateCategory[i] = "Good";
			}
			else if(ratingScore[i]<=0.05) {
				rateCategory[i] = "Average";
			}
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.println("CallID:[Auto-generated ID, Call Duration: "+callDurations[i]+" minutes"+" Call Quality: "+callQualities[i]+", Rating Category: "+rateCategory[i]);
		}
	}
}
