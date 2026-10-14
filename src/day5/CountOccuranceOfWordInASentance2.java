package day5;

public class CountOccuranceOfWordInASentance2 {
	public static void main(String[] args) {
		String sentance="one two one three four one five one six one seven";	
		String search="one";
		String words[]=sentance.split(" ");
	
	int occuranceCounter=0;   //word=one
	
	for(String word:words)
	{
		if(word.equalsIgnoreCase(search))
			occuranceCounter++;		
	}
	System.out.println(occuranceCounter);
	
}
}