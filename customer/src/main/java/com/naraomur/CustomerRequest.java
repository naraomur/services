package com.naraomur;

public record CustomerRequest(
        String firstName,
        String lastName,
        String email
) {
}
