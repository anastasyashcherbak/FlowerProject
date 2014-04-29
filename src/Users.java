public class User {
    private String password;
    private String login;

    public User(String login, String password){
        this.password = password;
        this.login = login;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 73 * hash + (this.login != null ? this.login.hashCode() : 0);
        return hash;
    }

     @Override
     public boolean equals(Object obj){
        if(this == obj)
            return true;
        if (!(obj instanceof User))
                    return false;
        User user = (User)obj;
        return ((login == null ? user.login == null : login.equals(user.login)) 
                && (password == null ? user.password == null : password.equals(user.password)));
    }
}
