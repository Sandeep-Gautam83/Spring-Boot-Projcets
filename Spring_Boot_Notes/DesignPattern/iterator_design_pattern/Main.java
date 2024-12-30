class Main{
    public static void main(String[] args){

        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("vinay", "112"));
        userManagement.addUser(new User("vinay", "113"));
        userManagement.addUser(new User("vishal", "114"));
        userManagement.addUser(new User("yash", "115"));
        
        MyIterator myIterator = userManagement.getIterator();
        while (myIterator.hasNext()) {
            User user = (User) myIterator.next();
            System.out.println(user.getName());
            
        }

    }
}