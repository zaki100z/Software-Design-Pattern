package myFirst.BuilderPattern;
public class UserProfileDirector {
    private UserProfileBuilder builder;

    public UserProfileDirector(UserProfileBuilder builder) {
        this.builder = builder;}

    public void changeBuilder(UserProfileBuilder builder) {
        this.builder = builder;
    }

    public UserProfile buildMinimalProfile(
            String username, String email, String firstName, String lastName
    ) {
        return builder.setUsername(username)
                .setEmail(email)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }

    public UserProfile buildCompleteProfile(
            String username, String email, String firstName, String lastName,
            int age, String address, String phoneNumber
    ) {
        return builder.setUsername(username)
                .setEmail(email)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setAddress(address)
                .setPhoneNumber(phoneNumber)
                .build();
    }

    public UserProfile buildAdminProfile(String username, String email) {
        return builder.setUsername(username)
                .setEmail(email)
                .setFirstName("Admin")
                .setLastName("User")
                .setAge(30)
                .setAddress("Admin Building")
                .setPhoneNumber("+1000000000")
                .build();
    }
}
