package HomeWork;

public class Student extends User{
    private Instructor instructor;
    private String homework;

    public void homeWork(User user){
        System.out.println("homework done with well");
        user.homeWork();
    }
}
