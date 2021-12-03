package io.github.seebaware.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService){

    @PostMapping
    public void regCustomer(@RequestBody CustomerRegRequest customerRegRequest) {
        log.info("a new customer has registered {}", customerRegRequest);
        customerService.register(customerRegRequest);
    }

}
