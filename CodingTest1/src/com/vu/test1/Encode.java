package com.vu.test1;


public class Encode {
	
	public static void main(String[] args) {
		Encode e = new Encode();
		e.decodefunc("aaaabbbccd"); //input
	}
	private void decodefunc(String input) {
		int counter = 1;
		StringBuilder sb = new StringBuilder();
		char previous = input.charAt(0);
		for(int i = 1; i<input.length();i++){
			char current = input.charAt(i);
			if(current == previous ) {
		        counter++;
		    } 
			else{
				sb.append(Character.toString(previous)+counter);
				counter = 1;
			}
			previous = current;
		}
		sb.append(Character.toString(previous)+counter);
		System.out.println("Decoded String : "+sb.toString());
	}

}
