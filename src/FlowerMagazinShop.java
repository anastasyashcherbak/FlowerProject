import java.util.Vector;

public class FlowerMagazinShop {

  public arraylist<realizeshop> shops;

  public arraylist<users> Users;

  public FlowerSet Flowers;

    public Vector  myUsers;
    public Vector  myDate;
    public Vector  myFlowerSet;
    public Vector  myRealizeShop;


  private void Searchshop( application) {
  }

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
