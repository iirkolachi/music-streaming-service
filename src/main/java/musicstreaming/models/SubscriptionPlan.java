package musicstreaming.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SubscriptionPlan {

    private static int totalPlans;

    private String type;
    private BigDecimal price;
    private LocalDate startDate;

    static {
        totalPlans = 0;
        System.out.println("Ready to create subscription plans");
    }

    public static int getTotalPlans() {
        return totalPlans;
    }

    public String getType() {
        return type;
    }

    public SubscriptionPlan(String type, BigDecimal price, LocalDate startdate) {
        this.type = type;
        this.price = price;
        this.startDate = startdate;
        totalPlans++;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

}