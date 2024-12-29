package org.strings;

public class Test {
	public static void main(String[] args) {
		char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
      int k =3;
      String input ="DGEO";
      int position =0;
      char[] inputCharArr=input.toCharArray();
      String output ="";
      
      for(int i=0;i<inputCharArr.length;i++) {
    	  char letter = inputCharArr[i];
    	  
    	  for (int j = 0; j < alphabets.length; j++) {
			if (alphabets[j]==letter) {
				position=j;
				break;
				
			}
		}
    	  int newposition = position-k;
    	  if (newposition<0) {
    		  newposition = alphabets.length+newposition;
			
		}
    	  output=output.concat(String.valueOf(alphabets[newposition]));
    	  
      }
      System.out.println(output);
      
	}

}
