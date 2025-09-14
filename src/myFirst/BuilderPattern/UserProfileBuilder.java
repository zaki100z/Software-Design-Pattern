package myFirst.BuilderPattern;

public interface UserProfileBuilder{
    UserProfileBuilder setUsername(String username);
    UserProfileBuilder setEmail(String email);
    UserProfileBuilder setFirstName(String firstName);
    UserProfileBuilder setLastName(String lastName);
    UserProfileBuilder setAge(int age);
    UserProfileBuilder setAddress(String address);
    UserProfileBuilder setPhoneNumber(String phoneNumber);
    UserProfile build();
}
