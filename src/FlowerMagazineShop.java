/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;


public class FlowerMagazineShop {
    private ArrayList<User> users;
    public ArrayList<RealizeShop> shops;

    public FlowerMagazineShop(){
        users = new ArrayList<User>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public User searchUser(User user) throws Exception{
        User searchedUser = null;

        for (User savedUser : users){
            if (savedUser.equals(user)){
                searchedUser = savedUser;
                break;
            }
        }

        if (null == searchedUser){
            throw new UserNotFoundException("User not contained");
        }

        return searchedUser;
    }
}
