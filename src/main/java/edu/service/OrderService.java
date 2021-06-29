package edu.service;

import edu.model.Order;
import edu.model.ShoppingCart;
import edu.model.User;
import java.util.List;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
