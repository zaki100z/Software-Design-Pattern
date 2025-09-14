package myFirst.BuilderPattern;

public class ConcreteUserProfile implements UserProfileBuilder {
    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;

    @Override
    public UserProfileBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public UserProfileBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserProfileBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserProfileBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserProfileBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public UserProfileBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public UserProfileBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public UserProfile build() {
        return new UserProfile(username, email, firstName, lastName, age, address, phoneNumber);
    }
}