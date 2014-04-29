public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
       testUserSearch();

       testFlowerCreation();
    }

    static void testUserSearch() throws Exception {
        User user = new User("Nastya", "123");
        User user2 = new User("Lera", "321");

        FlowerMagazineShop magazine = new FlowerMagazineShop();
        magazine.addUser(user);
        magazine.addUser(user2);

        User userForSearching = new User("Nastya", "1234");
        User searchedUser = null;

        try {
            searchedUser = magazine.searchUser(userForSearching);
        }
        catch(UserNotFoundException e) {
            System.out.println("Find error: " + e.getMessage());
        }
        if (null != searchedUser)
            System.out.println("Find user: " + searchedUser.getLogin() + " " + searchedUser.getPassword());

        userForSearching.setPassword("123");

        try {
            searchedUser = magazine.searchUser(userForSearching);
        }
        catch(UserNotFoundException e) {
            System.out.println("Find error: " + e.getMessage());
        }

        if (null != searchedUser)
            System.out.println("Find user: " + searchedUser.getLogin() + " " + searchedUser.getPassword());
    }

    static void testFlowerCreation() throws Exception {
        Flower flower = null;
        try {
            flower = new Flower("Rose", 20);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Find error: " + e.getMessage());
            flower = null;
        }

        if (null != flower)
            System.out.println("Flower: " + flower.getName());

        try {
            flower = new Flower("Rose", -20);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Find error: " + e.getMessage());
            flower = null;
        }

        if (null != flower)
            System.out.println("Flower: " + flower.getName());
    }
}
