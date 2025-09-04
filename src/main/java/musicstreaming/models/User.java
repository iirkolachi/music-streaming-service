package musicstreaming.models;

public class User {

    private String username;
    private String email;
    private SubscriptionPlan subscriptionPlan;
    private Library library;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.library = new Library(this);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SubscriptionPlan getSubscriptionPlan() {
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    public Library getLibrary() {
        return library;
    }
}