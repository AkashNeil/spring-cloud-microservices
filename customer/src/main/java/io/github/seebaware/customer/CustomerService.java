package io.github.seebaware.customer;


public record CustomerService() {
    public void register(CustomerRegRequest customerRegRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegRequest.firstName())
                .lastName(customerRegRequest.lastName())
                .email(customerRegRequest.email())
                .build();
    }
}
