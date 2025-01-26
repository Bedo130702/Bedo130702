 class Student{
    String name;
    int roll;
    static String school;
    public void printInfo(){
        System.out.println(name+"\n"+ roll+"\n"+school);
    }
    // ***** Copy Constructor *****
    Student(Student s2){
        this.name=s2.name;
        this.roll=s2.roll;
    }
    Student(){

    }
 }
public class USE_Static_KeyWord{
    public static  void  main(String args[]){
        Student.school="Thanamakhua Model HS";
        Student s1=new Student();
        s1.name="Bedabrata Patra";
        s1.roll=1;
//        s1.printInfo();
        Student s2=new Student(s1);
        s2.printInfo();
    }
}
