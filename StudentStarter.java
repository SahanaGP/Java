class StudentStarter{

public static void main(String[] values)
{

Student student=new Student(400,2017,'B');
int roll=student.rollNo;
System.out.println(roll);
StudentNames nm=student.name;
System.out.println(nm);
float money=student.fees;
System.out.println(money);
int bat=student.batch;
System.out.println(bat);
int yea=student.year;
System.out.println(yea);
char sec=student.section;
System.out.println(sec);

student.name=StudentNames.SUDEEP;
nm=student.name;
System.out.println(nm);

student.rollNo=20;
System.out.println(student.rollNo);

student.fees=70000;
System.out.println(student.fees);

Student stu=new Student();
System.out.println(stu.name);
System.out.println(stu.batch);
System.out.println(stu.section);
}
}