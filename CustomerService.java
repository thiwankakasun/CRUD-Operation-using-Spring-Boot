package com.example.CustomerTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CustomerService {

    @Autowired
    private CustomerRepository repository;
    //get(read)
    public List<Customer> getCustomers(){
        return repository.findAll();
    }

    //post(insert)
    public void add(Customer customer){
        repository.save(customer);
    }

    //put(update)
    public void update(Customer customer) {
        repository.save(customer);
    }


    //delete
    public void delete(Customer customer) {
        repository.deleteAll();
    }
}
