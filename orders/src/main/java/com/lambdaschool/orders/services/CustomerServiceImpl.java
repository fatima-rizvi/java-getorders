package com.lambdaschool.orders.services;

import com.lambdaschool.orders.models.Customer;
import com.lambdaschool.orders.repositories.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "customerservice")
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomersRepository customerrepo;

    @Transactional
    @Override
    public Customer save(Customer customer) {
        return customerrepo.save(customer);
    }
}
