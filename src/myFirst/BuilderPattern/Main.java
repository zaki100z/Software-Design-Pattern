package myFirst.BuilderPattern;
public class Main {
    public static void main(String[] args) {
        // Not sing the Director
        System.out.println(" Building without Director: ");
        UserProfileBuilder builder = new ConcreteUserProfile();
        UserProfile user1 = builder.setUsername("AliKhan")
                .setEmail("aliKhan@gmail.com")
                .setFirstName("Ali")
                .setLastName("Khan")
                .setAge(20)
                .setAddress("Astana Kazakhstan")
                .setPhoneNumber("+1234567890")
                .build();
        System.out.println(user1);

        // Example 2: Using the Director to build predefined profiles
        System.out.println("\n Building with Director: ");
        UserProfileDirector director = new UserProfileDirector(new ConcreteUserProfile());

        UserProfile minimalProfile = director.buildMinimalProfile(
                "Madiyar", "Madiyar@gmail.com", "Madiyar", "Madi");
        System.out.println("Minimal Profile: " + minimalProfile);

        UserProfile completeProfile = director.buildCompleteProfile(
                "alice", "alice@gmail.com", "Alice", "Susani",
                25, "Qubanbai Batyr Avenue", "+0987654321");
        System.out.println("Complete Profile: " + completeProfile);

        UserProfile adminProfile = director.buildAdminProfile(
                "admin", "admin@example.com");
        System.out.println("Admin Profile: " + adminProfile);
    }
}
