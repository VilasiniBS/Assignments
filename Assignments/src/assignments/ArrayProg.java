package assignments;

public class ArrayProg {

	public static void main(String[] args) {
		String [][][] Semester = new String[5][2][6];
		
		//Sem1
		Semester[0][0][0]= "Mathematics1 PASS(78)";
		Semester[0][0][1]= "physics PASS(85)";
		Semester[0][0][2]= "Chemistry Fail(21)";
		Semester[0][0][3]= "Computer prog PASS(74)";
		Semester[0][0][4]= "Engineering draw PASS(88)";
		Semester[0][0][5]= "Basic Electrical engineering PASS(78)";
		
		//Marks
		Semester[0][1][0]= "PASS(78)";
		Semester[0][1][1]= "PASS(85)";
		Semester[0][1][2]= "Fail(21)";
		Semester[0][1][3]= "PASS(74)";
		Semester[0][1][4]= "PASS(88)";
		Semester[0][1][5]= "PASS(78)";
		
		
		//Sem2
				Semester[1][0][0]= "Maths 11";
				Semester[1][0][1]= "mechanics";
				Semester[1][0][2]= "Environment";
				Semester[1][0][3]= "basic electronice";
				Semester[1][0][4]= "Engineering physcis";
				Semester[1][0][5]= "Engineering Graphics";
				
				//Marks
				Semester[1][1][0]= "PASS(82)";
				Semester[1][1][1]= "PASS(77)";
				Semester[1][1][2]= "PASS(93)";
				Semester[1][1][3]= "fail(19)";
				Semester[1][1][4]= "fail(27)";
				Semester[1][1][5]= "PASS(90)"; 
				
				//Sem 4
				Semester[3][0][0]= "Algorithm";
				Semester[3][0][1]= "computer networks";
				Semester[3][0][2]= "Database systems";
				Semester[3][0][3]= "Microprocessors";
				Semester[3][0][4]= "Communication Engineering";
				Semester[3][0][5]= "software engineering ";
				
				//Marks
				Semester[3][1][0]= "PASS(91)";
				Semester[3][1][1]= "PASS(73)";
				Semester[3][1][2]= "Fail(19)";
				Semester[3][1][3]= "PASS(80)";
				Semester[3][1][4]= "PASS(76)";
				Semester[3][1][5]= "PASS(87)";
		
		System.out.println("Sem 2 of subject 4 and 5 names is :" + Semester[1][0][3]  + ", " + Semester[1][0][4]);
		System.out.println("Marks sem 4 of subject 3 and 4 is : " + Semester[3][1][2] + ", " + Semester[3][1][3]);
		
		
		
				
		
		
		
		

	}

}
