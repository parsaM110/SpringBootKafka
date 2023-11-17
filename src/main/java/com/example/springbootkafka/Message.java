package com.example.springbootkafka;

import java.time.LocalDateTime;

public record Message(
        String message,
        LocalDateTime created
) {
}
