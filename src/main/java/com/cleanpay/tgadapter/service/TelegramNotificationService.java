package com.cleanpay.tgadapter.service;


import com.cleanpay.tgadapter.config.properties.TelegramProperties;
import com.cleanpay.tgadapter.model.Notification;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
@Slf4j
public class TelegramNotificationService extends TelegramLongPollingBot {
    private final TelegramProperties telegramProperties;

    public TelegramNotificationService(
            final TelegramProperties telegramProperties
    ) {
        super(telegramProperties.getApiToken());
        this.telegramProperties = telegramProperties;
    }

    @Override
    public String getBotUsername() {
        return "CleanPay";
    }

    @Override
    public void onUpdateReceived(final Update update) {
    }

    public void sendMessage(final @NotNull Notification notification) {

        final SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(telegramProperties.getChatId());
        sendMessage.setText(notification.getSource() + " " + notification.getText());

        try {
            execute(sendMessage);
            log.debug("sent message to telegram for notification - {}", notification);
        } catch (final TelegramApiException e) {
            log.error(e.getMessage(), e);
            throw new RuntimeException("Unable to send notification");
        }
    }
}
