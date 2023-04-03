package com.chat_bot.config;

import lombok.Data;
import org.springframework.context.annotation.*;
import org.springframework.beans.factory.annotation.*;


@Configuration
@Data
@PropertySource("config.properties")
public class BotConfig {
    @Value("${bot.name}")
    String botName;
    @Value("${bot.token}")
    String token;
}