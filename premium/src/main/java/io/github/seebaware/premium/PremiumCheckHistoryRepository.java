package io.github.seebaware.premium;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremiumCheckHistoryRepository extends JpaRepository<PremiumCheckHistory, Integer> {

}
