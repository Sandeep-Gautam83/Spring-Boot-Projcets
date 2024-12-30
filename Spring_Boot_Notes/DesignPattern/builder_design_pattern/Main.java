public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                            .setEmailId("targetit99@gmail.com")
                            .setUserId("USERID123")
                            .setUserName("Vinay")
                            .build();
        System.out.println(user);

        User user2 = User.UserBuilder.builder()
        .setEmailId("vinay@gmail.com")
        .setUserId("USER1234")
        .setUserName("Vicky")
        .build();

        System.out.println(user2);
    }
}
