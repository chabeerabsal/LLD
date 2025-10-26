package Modellor;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;
    UserController() {
        users=new ArrayList<User>();
    }
    public void addUser(User user){
        users.add(user);
    }
    public boolean verifyUser(User user){
        for(User u:users){
            if(u.getCard().getNo()==user.getCard().getNo()&&u.getCard().getPin()==user.getCard().getPin()){
                return true;
            }
        }
        return false;
    }
}
