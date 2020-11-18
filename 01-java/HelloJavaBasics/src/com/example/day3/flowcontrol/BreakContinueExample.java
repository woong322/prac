package com.example.day3.flowcontrol;

public class BreakContinueExample {

	public static void main(String[] args) {
		int i=0;
		
		while(i<8) {
			i++;
			if(i==4)
				//break;	//break will exit the loop entirely
				continue;	//continue will IMMEDIATELY go to the next iteration of the loop
			
			//System.out.println(i);
			
		}
		
		
		///////////////////////////////LABELS
		pineapple: //<---this is a label
		for(int j=0; j<3; j++) {
			
			potato: //<----this is a label
			for(int k=0; k<3; k++) {
				//FROM INSIDE THIS LOOP
				//I don't want j to print out the value of 1, AND I don't want "end of outer loop" to appear for j==1
				
				if(j==1)
					//break potato;
					continue pineapple;
	
				System.out.println("j: "+j + " k: "+k);
			}
			
			System.out.println("end of outer loop");
		}
		
		System.out.println("done");

	}

}
