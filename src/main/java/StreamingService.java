import java.util.*;

public class StreamingService {
    private String name;
    private static int totalUsers;
    private List<User> users;

    static {
        totalUsers = 0;
    }

    public StreamingService(String name) {
        this.name = name;
        this.users = new ArrayList<>();
        System.out.println(name + " streaming service initialized!");
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void addUser(User user) {
        users.add(user);
        incrementUsers();
    }

    public List<User> getUsers() { return users; }

    public static void incrementUsers() { totalUsers++; }
    public static int getTotalUsers() { return totalUsers; }
}
