package HomeWork;

public class StudentManager extends User{
    public void addStudent(Student student){
        System.out.println("student added");
    }
    @Override
    public void homeWork(){
        System.out.println("Student homework");
    }
}
