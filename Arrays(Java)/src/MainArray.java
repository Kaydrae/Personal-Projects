import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		Scanner userInputText = new Scanner(System.in);//Scanner for text
		Scanner userInputNums = new Scanner(System.in);//Scanner for numbers
		ArrayClass ArrayList = new ArrayClass();
		String userAnswer;
		int containValue;
		int searchValue;
		int deleteValue;
		int addValue;
		
		System.out.println("Welcome to my program. Here I'm just playing with arrays. Shall we get started? Yes or No?");
			  userAnswer = userInputText.next();
			
			while(userAnswer.equals("Yes") || userAnswer.equals("yes")){
				
				ArrayList.gettingArraySize();
				ArrayList.genRanArray();
				ArrayList.printingArray();
				
				System.out.println("Now that we have our table has index (Left) and values(right). Lets see if the number you pick is a value.");
					containValue = userInputNums.nextInt();
					
				System.out.println(ArrayList.doesArrayContainValue(containValue));
					
				//Space
				System.out.println();
							
				System.out.println("Lets add a index.");
					addValue = userInputNums.nextInt();
				
				ArrayList.valueInsert(addValue);
				ArrayList.printingArray();
				
				System.out.println("Now select a index to delete.");
				deleteValue = userInputNums.nextInt();
					
				ArrayList.indexDelete(deleteValue);
				ArrayList.printingArray();
				
			//	System.out.println("Now lets Search for a value... This should be fun.");
			//	System.out.println("Please enter a number");
			//		searchValue = userInputNums.nextInt();	
			//	System.out.println(ArrayList.linearSearch(searchValue));
				
				System.out.println("Thank you for using my program. Would you like another go?");	
					userAnswer = userInputText.next();
				
			}
	    
			if(userAnswer.equals("No") || userAnswer.equals("no")){
				System.out.println("Aww...Why not? Well... Okay. I thought it was cool. :/ Maybe next time. Have a great day.");
				System.exit(0);
			}
		
		
		
	}

	
}
