package io.github.seebaware.customer;

public record CustomerRegRequest(
        String firstName,
        String lastName,
        String email
) {
}
