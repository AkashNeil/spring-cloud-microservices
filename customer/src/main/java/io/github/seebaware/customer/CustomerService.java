package io.github.seebaware.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class CustomerService {

    private final CustomerRepo customerRepo;
    private final RestTemplate restTemplate;

    public void register(CustomerRegRequest customerRegRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegRequest.firstName())
                .lastName(customerRegRequest.lastName())
                .email(customerRegRequest.email())
                .build();

        customerRepo.saveAndFlush(customer);

        PremiumCheckResponse premiumCheckResponse = restTemplate.getForObject(
                "http://PREMIUM/api/v1/premium-check/{customerId}",
                PremiumCheckResponse.class,
                customer.getId()
        );

        if (premiumCheckResponse.isPremium()) {
         throw new IllegalStateException("Premium!");
        }

        customerRepo.save(customer);

    }
}
