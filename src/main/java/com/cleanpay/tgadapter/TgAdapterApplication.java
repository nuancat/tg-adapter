package com.cleanpay.tgadapter;

import com.cleanpay.tgadapter.config.properties.TelegramProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(TelegramProperties.class)
public class TgAdapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TgAdapterApplication.class, args);
	}

}
