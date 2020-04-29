package StudentsInfo;

import java.util.Scanner;

public class StudentInfoTest {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);


		/*student class of at least 10 people
		 *
		 * give appropriate responses
		 * 
		 * validate user choices and ask again if they provide an invalid info type
		 * 
		 * Specs: Account for invalid user input with exceptions
		 *        Try to incorporate IndexOutOfBoundsException
		 *        
		 * -Tell the user what info is available
		 * -use parallel arrays for student data
		 * -chap 13
		 * 
		 * **create other exceptions BONUS!!
		 * 
		 * completed all the objectives !!
		 * 
		 * secret loop from the 10th dimension
		 * 
		 * do{ or }while
		 * print ?
		 * initial scnr
		 * do{
		 * try{
		 * if ()break; leaves loop correct answer
		 * else if{break; leaves loop correct answer
		 * else{
		 * throw new exception
		 * catch{ exception asks ?
		 * scnr restarts loop
		 * }while(true)
		 * 
		 */
		String[] student = {"Rick", "John", "Angel", "Erin", "April", "Mike", "Jamal", "Erica", "Donny", "Terrance"};
		String[] studentLast = {"Nero","Quiet","Stars","Darren","Kinder","Saunders","Derrk","Small","Tiller","Williams",};
		String[] studentActivity = {"play soccer.", "play chess.", "tune cars.", "making sushi.", "scuba dive with sharks.",
				"groom pet's.", "prospect for fossils.", "burn poetry.", "make soap.", "fly drones."};  
		String[] studentHometown = {"Dearborn, MI","Woodhaven, MI","Monroe, MI","Warren, MI","Port Huron, MI",
				"Flint, MI","Auburn Hills, MI","Detroit, MI","Canton, MI","Utica, MI",};
		
		
		// use a do if else loop to consolidate this last area
		do {
			System.out.println("Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-10):");

			int studentSelection = scnr.nextInt()-1; 
			
			do {

			try { //beginning of try catch

				if (studentSelection < 0 || studentSelection > 9) {//this try statement is used for ArrayIndexOutOfBoundsException

					throw new Exception ("That student does not exist. Please try again. (enter a number 1-10):");
				
				}else {break;}

				//prompt the user to ask about a specific student
          
			     }catch (Exception excpt){ //end of first try catch // could not understand how to include out of bound exception
					System.out.println(excpt.getMessage());
					studentSelection=scnr.nextInt()-1; //-1 to account for array index
				 }
            }while(true);	
			
			System.out.println("Student " + (studentSelection + 1) + " is " + student[studentSelection] + " " + studentLast[studentSelection]
					+ ". What would you like to know about " + student[studentSelection] + "? (Enter: \"hobby\" or \"hometown\")");          
			
			String studentDetail =scnr.nextLine();
			       studentDetail =scnr.nextLine(); //clears the whitespace in scanner
					do {
					try {	
						
						if (studentDetail.equals("hobby")) {System.out.println(student[studentSelection] + " likes to " + studentActivity[studentSelection]);
						break;
								}
							else if (studentDetail.equals("hometown")) {System.out.println(student[studentSelection] + "'s Hometown is " + studentHometown[studentSelection] + ".");
							break;
							}
						 
							else {throw new Exception ("That data does not exist. Please try again. (enter or “hobby” or “hometown”):");}
					}
						catch (Exception excpt){
							System.out.println(excpt.getMessage());
							studentDetail =scnr.nextLine();
						}
					}while(true);
					
			
			System.out.println("Type \"yes\" to learning about other students or \"no\" to leave.");	
		}while (scnr.next().equalsIgnoreCase("YES"));	//ask if the user wants to learn about another student
		
		System.out.println("Ok, have a good day!");
		scnr.close();
	}
		
	}
	




