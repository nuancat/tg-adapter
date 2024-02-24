package com.cleanpay.tgadapter.config.autoconfig;

import com.cleanpay.tgadapter.config.properties.TelegramProperties;
import com.cleanpay.tgadapter.service.TelegramNotificationService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = TelegramProperties.class)
public class TNSAutoconfiguration {
    @Bean
    TelegramNotificationService getVkLog(TelegramProperties tp) {
        return new TelegramNotificationService(tp);
    }
}
