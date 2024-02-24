package com.cleanpay.tgadapter.model;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Notification {
    private String source;
    private String text;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}