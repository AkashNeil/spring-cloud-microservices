package io.github.seebaware.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepo customerRepo;

    public void register(CustomerRegRequest customerRegRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegRequest.firstName())
                .lastName(customerRegRequest.lastName())
                .email(customerRegRequest.email())
                .build();

        customerRepo.save(customer);

    }
}
