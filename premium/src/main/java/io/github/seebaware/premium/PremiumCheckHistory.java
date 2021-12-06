package io.github.seebaware.premium;

import lombok.*;

import javax.persistence.*;
import java.security.PrivateKey;
import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PremiumCheckHistory {

    @Id
    @SequenceGenerator(
            name = "premium_id_sequence",
            sequenceName = "premium_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "premium_id_sequence"
    )
    private Integer id;
    private Integer customerId;
    private Boolean isPremium;
    private LocalDateTime createdAt;


}
