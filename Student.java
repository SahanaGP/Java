class Student
{
int rollNo;
StudentNames name=StudentNames.SAHANA; 
float fees;
int batch;
int year;
char section;
Student(int rollNo,int batch,char section)
   {
    this.rollNo=rollNo;
    this.batch=batch;
	this.section=section;
    System.out.println("invoked string,int,char Constructor of Student");
   }
   
Student()
   {
     System.out.println("Invoking no argument Constructor of Student");
     this.batch=2015;
	 this.section='A';
   }
  
Student(int batch)
    {
      this.batch=batch;
      System.out.println("Invoking int Constructor of Student");
    }

Student(StudentNames name)
    {
      this.name=name;
      System.out.println("Invoking String constructor of Student");
    }

Student(char section)
    {
	  this.section=section;
	  System.out.println("Invoking char constructor of Student");
	}


}