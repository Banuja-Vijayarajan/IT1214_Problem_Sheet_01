class Student{
	//Private fields
		
		private String name; 
		private int exam1;
		private int exam2;
		private int exam3;
	
	boolean validateMarks(int marks){
		if (marks <= 100 && marks>=0 ){
			return true;
		}
		else{
			return false;
		}
	}

	//constructors
	Student(String name, int exam1, int exam2, int exam3)throws  Exception{
		this.name=name;
	
		if(validateMarks(exam1)&&(validateMarks(exam2))&&validateMarks(exam3)){
			this.exam1=exam1;
			this.exam2=exam2;
			this.exam3=exam3;
		}else{
			System.out.println("Setting the marks values to 0");
			throw new Exception("Invalid marks");
		}
		
		//this is where we enter the marks, so, validate here
	}
		/*Student(String na, int e1, int e2, int e3){
		name=na;
		exam1=e1;
		exam2=e2;
		exam3=e3;*/
		
		//Getter methods for all fields 
		String getName(){
			return name;
		}
		
		int getExam1(){
			return exam1;
		}
		
		int getExam2(){
			return exam2;
		}
		
		int getExam3(){
			return exam3;
		}
		
	}
	
	class StudentDemo{
		public static void main(String[] args){
			try{
			Student s1 = new Student("Adam",75,90,10);
			
			System.out.println("Name of the student 1 is : "+ s1.getName());
			System.out.println("Marks of the student 1 for exam 1 is : "+ s1.getExam1());
			System.out.println("Marks of the student 1 for exam 2 is : "+ s1.getExam2());
			System.out.println("Marks of the student 1 for exam 3 is : "+ s1.getExam3());
			
			Student s2 = new Student("Eve",50,25,65);
			System.out.println("Name of the student 2 is : "+ s2.getName());
			System.out.println("Marks of the student 2 for exam 1 is : "+ s2.getExam1());
			System.out.println("Marks of the student 2 for exam 2 is : "+ s2.getExam2());
			System.out.println("Marks of the student 2 for exam 3 is : "+ s2.getExam3());
			}catch(Exception e)
			{
			
			System.out.println("Exception is : "+e.getMessage());	
			}	
		}
	}
	
	

/*

//somewhere in student class
	Student(String name, int marks1, int marks2, int marks3){
		this.name=name;
		if(validateMarks(marks)&&validateMarks(marks2)&&validateMarks(marks3))
	}
*/
