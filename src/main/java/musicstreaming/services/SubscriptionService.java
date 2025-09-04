package musicstreaming.services;

import musicstreaming.models.*;

public class SubscriptionService {

    public void subscribeUser(User user, SubscriptionPlan plan, StreamingService service) {
        user.setSubscriptionPlan(plan);
        service.addUser(user);
        System.out.println(user.getUsername() + " subscribed to " + plan.getType() + " plan for ₾" + plan.getPrice());
    }
}