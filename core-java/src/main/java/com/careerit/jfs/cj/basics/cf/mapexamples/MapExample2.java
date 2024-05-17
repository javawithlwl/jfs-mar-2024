package com.careerit.jfs.cj.basics.cf.mapexamples;

import java.util.List;
import java.util.Map;

record UserDetails(int id, String username, String password, String email, String mobile) {
}
class LoginService{

    private List<UserDetails> userDetails;
    private Map<String,UserDetails> userMap;
    public LoginService(){
        this.userDetails = getUserDetails();
        for(UserDetails user: userDetails){
            userMap.put(user.username(), user);
        }
    }

    public UserDetails login(String username, String password){
        if(userMap.containsKey(username)){
            UserDetails user = userMap.get(username);
            if(user.password().equals(password)){
                return user;
            }
        }
        throw new IllegalArgumentException("Username or password is incorrect");
    }

    public  List<UserDetails> getUserDetails() {
        return List.of(
                new UserDetails(1001, "user1", "user1@123", "user1@gmail.com", "9999999999"),
                new UserDetails(1002, "user2", "user2@123", "user2@gmail.com", "8888888888"),
                new UserDetails(1003, "user3", "user3@123", "user3@gmail.com", "7777777777"),
                new UserDetails(1004, "user4", "user4@123", "user4@gmail.com", "6666666666"),
                new UserDetails(1005, "user5", "user5@123", "user5@gmail.com", "5555555555")
        );
    }
}
public class MapExample2 {

    public static void main(String[] args) {

        LoginService loginService = new LoginService();
        UserDetails user = loginService.login("abcd", "user1@123");

    }




}
