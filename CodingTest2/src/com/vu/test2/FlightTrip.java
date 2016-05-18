package com.vu.test2;

import java.util.ArrayList;

public class FlightTrip {
	
	ArrayList<ArrayList<String>>  possiblePathsList = new ArrayList<ArrayList<String>>();
	public static void main(String[] args) {
		String[] array1 = {"jfk","lhr"};
		String[] array2 = {"ord","jfk"};
		String[] array3 = {"sfo","ord"};
		String[] array4 = {"lhr","cdg"};
		//String[] array5 = {"cdg","bna"}; //To test with various inputs, add the  dept and arrival airport nodes
		String[][] arrays = { array1, array2, array3, array4}; //Array of Arrays
		FlightTrip ft = new FlightTrip();
		ft.calcFinalDest(arrays);
		ft.findBestPath();
	}
	public void calcFinalDest(String[][] arrays){		
		for(String[] str1: arrays){
		ArrayList<String> paths = new ArrayList<>();
		String dept = str1[0];
		String arrival = str1[1];
		paths.add(dept);
		paths.add(arrival);
		    for(int i = 0; i<arrays.length;i++){
		    	for(int j = 0; j<arrays.length;j++){
		    	String[] str = arrays[j];
			    if(str[0] == arrival){	
			    paths.add(str[1]);	
			    arrival = str[1];
				}
		    	}		    	
			}
			possiblePathsList.add(paths); 
		}		    
	}

	public void findBestPath(){
		int count = 0; 
		ArrayList<String> path = null;
		for(int i = 0; i<possiblePathsList.size();i++){
		int n = possiblePathsList.get(i).size();
		System.out.print("Possible path "+i+"\n");
		System.out.println(possiblePathsList.get(i)+"\n");
		if(n>=count){
			count = n;
			path = possiblePathsList.get(i);
			
		}}
	   System.out.print("Best Path from the depature to destination");
	   for(String str : path){
	   System.out.print(" --> ");
	   System.out.print(str);
	}
	}
}
