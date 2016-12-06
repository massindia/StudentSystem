public class Result {

	
		
	    String name;
		int rollno;
		String Percentage;
		String height;
		String weight;
		
		
		public Result(String name, int rollno, String Percentage, String height, String weight) {
			this.name = name;
			this.rollno = rollno;
			this.Percentage = Percentage;
			this.height = height;
			this.weight = weight;
		}
		
		public void getStudentHeight(){
			System.out.println("The student height is " +height );
		}
		
		public void getStudentWeight(){
			System.out.println("The student weight is " +weight);
		}
		
		public static void main(String[] args) {
// Detail of 3 Students
			Result studentDetails1 = new Result("Aarzo",25,"56%","155 cm","54g");  //1st student detail
			Result studentDetails2 = new Result("Ajit",17,"90%","145cm","58 kg");   //2nd Student detail
			 Result studentDetails3 = new Result("Ranjana",5,"69%","158cm","60 kg");  //3rd student detail
			
			//now printing 1st student detail
			System.out.println("The student name is "+studentDetails1.name); // here we print first student name
			System.out.println("The student Roll No is " +studentDetails1.rollno);  //1st student Roll No
			System.out.println("The student Percentage marks pecentage is " +studentDetails1.Percentage);  //1st student percentage
			studentDetails1.getStudentHeight();//here we first taking student height from another class then print here
			studentDetails1.getStudentWeight();//here we first taking student weight from another class then print here
		    
			System.out.println("1st Student Detail Finished");

			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			//now printing 2nd student detail
			System.out.println("the student name is " +studentDetails2.name);// here we print first student name
			System.out.println("The student Roll No is " +studentDetails2.rollno);//1st student Roll No
			System.out.println("the student overall marks percentage is " +studentDetails2.Percentage); //1st student percentage
			studentDetails2.getStudentHeight();//here we first taking student height from another class then print here
			studentDetails2.getStudentWeight();//here we first taking student weight from another class then print here

			System.out.println("2nd Student Detail Finished");

			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	
			
		   
		    System.out.println("The student name is "+studentDetails3.name);// here we print first student name
		    System.out.println("The student Roll No is " +studentDetails3.rollno);//1st student Roll No
		    System.out.println("The student overall marks percentage is " +studentDetails3.Percentage);//1st student percentage
		    studentDetails3.getStudentHeight();//here we 3rd  taking student height from another class then print here
		    studentDetails3.getStudentWeight();//here we first taking student height from another class then print here

			System.out.println("3rd Student Detail Finished Now");

			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
			
		}
		
		
		
	

}