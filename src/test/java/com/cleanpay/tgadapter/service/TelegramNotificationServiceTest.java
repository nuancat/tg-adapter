package com.cleanpay.tgadapter.service;

import com.cleanpay.tgadapter.model.Notification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TelegramNotificationServiceTest {

    @Autowired
    TelegramNotificationService telegramNotificationService;
    @Test
    void sendMessage() {
        final Notification notification = new Notification();
        notification.setText("teeeext");
        notification.setSource("soooource");
        telegramNotificationService.sendMessage(notification);
    }
}