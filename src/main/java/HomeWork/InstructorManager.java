package HomeWork;

public class InstructorManager extends User{
    public void addInstructor(Instructor instructor){
        System.out.println("instructor added");
    }
    @Override
    public void homeWork(){
        System.out.println("Instructor homework");
    }
}
