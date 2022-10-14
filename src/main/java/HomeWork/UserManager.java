package HomeWork;

public class UserManager extends User{
    public void addUser(User user){
        System.out.println("user has been added on system");
    }
    public void removeUser(User user){
        System.out.println("User has been removed on system");
    }
    public void updateUser(User user){
        System.out.println("User has been updated on system");
    }

    @Override
    public void homeWork(){
        System.out.println("user manager homework");
    }

}
