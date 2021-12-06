package io.github.seebaware.premium;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class PremiumService {

    private final PremiumCheckHistoryRepository premiumCheckHistoryRepository;

    public boolean isPremiumCustomer(Integer customerId) {

        premiumCheckHistoryRepository.save(
                PremiumCheckHistory.builder()
                        .customerId(customerId)
                        .isPremium(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );

        return false;

    }

}
