package com.chat_bot.config;
import com.chat_bot.DiaryTelegramBot;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.LongPollingBot;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;
import org.springframework.context.event.*;

@Slf4j
@Component
public class Initializer {
    @Autowired DiaryTelegramBot bot;

    @EventListener({ContextRefreshedEvent.class})
    public void init() {
        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot((LongPollingBot) bot);
        } catch (TelegramApiException e) {
            log.error(e.getMessage());
        }
    }
}
