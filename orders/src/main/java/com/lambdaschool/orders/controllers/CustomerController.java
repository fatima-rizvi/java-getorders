package com.lambdaschool.orders.controllers;

import com.lambdaschool.orders.models.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    //    http://localhost:2019/customers/orders (returns all customers with their orders)
    @GetMapping(value = "/orders", produces {"application/json"})
    public ResponseEntity<?> getAllCustomerOrders() {
        List<Customer> rtnList =
    }


//    http://localhost:2019/customers/customer/7
//    http://localhost:2019/customers/customer/77
//    http://localhost:2019/customers/namelike/mes
//    http://localhost:2019/customers/namelike/cin


}
