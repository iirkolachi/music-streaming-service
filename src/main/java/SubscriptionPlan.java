public class SubscriptionPlan {
    private String type;
    private double price;
    private static int totalPlans;

    static {
        totalPlans = 0;
        System.out.println("Ready to create subscription plans");
    }

    public SubscriptionPlan(String type, double price) {
        this.type = type;
        this.price = price;
        totalPlans++;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public static int getTotalPlans() { return totalPlans; }
}
