import java.util.Scanner;

public class ArrayClass {

	//Creating the array 
	private int [] TestArray = new int [50];
	
	//setting the size of the array
	private int arraySize; 
	
	public void gettingArraySize(){
		Scanner userInputNums = new Scanner(System.in);//Scanner for numbers
		
		System.out.println(" Please enter a number. The first one that comes to mind. I recommend 10 but you are your own person.");
		 arraySize = userInputNums.nextInt();
	}
	
	//Filling the arrays with random numbers 
	public void genRanArray(){
		
		for (int i = 0; i < arraySize; i++){
			TestArray[i] = (int)(Math.random()* 10) + 5;
		}
	}
	
	//Printing out the array 
	public void printingArray(){
		System.out.println("----------");
		 	for(int i = 0; i < arraySize; i++){
		 		System.out.print("| " + i + " | ");
		 		System.out.println(TestArray[i] + i + " | ");
		 		System.out.println("----------");
		 	}
	}
	
	//Grabbing data by the index
	public int getValueByIndex(int Index){
		if(Index < arraySize) return TestArray[Index];
		return 0;
	}
	
	//Seeing if an array contains a value
	public boolean doesArrayContainValue(int valueSearched){
		boolean arrayValue = false; 
		
		for(int i = 0; i < arraySize; i++){
			if(TestArray[i] == valueSearched){
				
				arrayValue = true;
			}
		}
		return arrayValue;
	}
	
	//Deleting and index and moving a value up
	public void indexDelete(int Index){
		
		if(Index < arraySize){
			for(int i = Index; i < arraySize; i++){
				TestArray[i] = TestArray[i + 1];
			}
			arraySize --;
		}	
	}
	
	//Inserting values
	public void valueInsert(int value){
		if(arraySize < 50){
			TestArray[arraySize] = value;
			arraySize ++;
		}
	}
	
	//Linear Search
	//Finding all of the same 
	public String linearSearch(int value){
		boolean arrayValue = false;
		String indexValue = "";
		System.out.println("A value was found: ");
		for(int i = 0; i < arraySize; i++){
			if(TestArray[i] == value){
				arrayValue = true;
				System.out.println(i + "");
				indexValue = i + "";
			}
			if(!arrayValue){
				indexValue = "None";
				System.out.println(indexValue);
			}
			//Space
		System.out.println("");
		}
		return indexValue;
	}
}
