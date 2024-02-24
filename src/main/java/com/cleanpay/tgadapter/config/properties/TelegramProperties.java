package com.cleanpay.tgadapter.config.properties;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Data
@ConfigurationProperties(prefix = "app.telegram")
@Validated
public class TelegramProperties {
    @NotBlank
    private String apiToken;
    @NotBlank
    private String chatId;
}
