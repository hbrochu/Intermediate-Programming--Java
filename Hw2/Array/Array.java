/**
	This program will transform an array and display the transformations
*/
/*
	collaborators/references: none
*/
import java.util.Random;

public class Array{
	
	public static final int MAX= 10;

	public static void randomNums(int [] list){
		Random rand = new Random();//random number
		
		for(int i=0; i<list.length; i++){
			list[i]= rand.nextInt(4)+1;
		}
	}
	public static void display(int [] list, int [] tripList, int [] sumList){
		String message;
		
		System.out.printf("\trandomNums\ttripleNums\t\tsums\n");
		for(int i=0; i<MAX; i++){
			message= String.format("%1s\t\t%2s\t\t%2s\t\t%2s", i, list[i], tripList[i], sumList[i] + "\n");
			System.out.printf(message);
		}
	}
	public static void tripleNums(int [] list, int [] tripList){
		for(int i= 0; i<list.length; i++){
			tripList[i]= list[i]*3;
		}
	}
	public static void sums(int [] list, int [] tripList, int [] sumList){
		for(int i= 0; i<list.length; i++){
			sumList[i]= list[i]+tripList[i];
		}
	} 
	public static void main(String[] args){
		int [] list= new int[MAX];
		int [] tripList= new int[MAX];
		int [] sumList= new int[MAX];
		
		randomNums(list);
		tripleNums(list, tripList);
		sums(list, tripList, sumList);
		display(list, tripList, sumList);
		

	}//end main
}//end class