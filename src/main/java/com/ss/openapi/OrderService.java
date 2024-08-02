package com.ss.openapi;

import com.ss.openapi.api.OrderApiDelegate;
import com.ss.openapi.api.model.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderService  implements OrderApiDelegate {
    @Override
    public ResponseEntity<Order> orderGet() throws Exception {
        Order o =new Order();
        o.setComplete(true);
        o.setId(100L);
        o.setStatus(Order.StatusEnum.APPROVED);
        return ResponseEntity.ok(o);
    }
}
