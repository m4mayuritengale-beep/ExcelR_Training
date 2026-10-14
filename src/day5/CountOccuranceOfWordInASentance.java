package day5;

public class CountOccuranceOfWordInASentance {
	public static void main(String[] args) {
		String sentance="one two one three four one five one six one seven";	
		String search="one";
	
	int searchStart=0;
	int index=0;
	int occuranceCounter=0;  
	do
	{
	index=sentance.indexOf(search,searchStart);  
		if(index!=-1)											
		{
		occuranceCounter++;										//occuranceCount=0,1,2,3
		}
	searchStart=index+search.length();
	
	}while(index!=-1);
	System.out.println(occuranceCounter);
	
}
}