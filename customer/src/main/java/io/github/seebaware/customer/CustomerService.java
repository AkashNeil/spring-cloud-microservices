package io.github.seebaware.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService() {
    public void register(CustomerRegRequest customerRegRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegRequest.firstName())
                .lastName(customerRegRequest.lastName())
                .email(customerRegRequest.email())
                .build();
    }
}
