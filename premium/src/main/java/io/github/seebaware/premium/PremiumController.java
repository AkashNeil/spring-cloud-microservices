package io.github.seebaware.premium;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/premium-check")
@AllArgsConstructor
@Slf4j
public class PremiumController {

    private final PremiumService premiumService;

    @GetMapping(path = "{customerId}")
    public PremiumCheckResponse isPremium (@PathVariable("customerId") Integer customerId) {

        boolean isPremiumCustomer = premiumService.isPremiumCustomer(customerId);
        log.info("Premium check request for customer {}", customerId);
        return new PremiumCheckResponse(isPremiumCustomer);

    }

}
