package com.example.springbootkafka.config;

import java.time.LocalDateTime;

public record Message(
        String message,
        LocalDateTime created
) {
}
