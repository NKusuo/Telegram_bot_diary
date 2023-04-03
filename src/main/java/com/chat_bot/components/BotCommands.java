package com.chat_bot.components;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

import java.util.List;

public interface BotCommands {
    List<BotCommand> LIST_OF_COMMANDS = List.of(
            new BotCommand("/Start", "start bot"),
            new BotCommand("/help", " help info!"),
            new BotCommand("/new_record", "create new record"),
            new BotCommand("/edit_record", "edit record"),
            new BotCommand("/view_record", "view old record"),
            new BotCommand("/view_all_records", "view all records")

    );

    String HELP_TEXT = "\"Здравствуй! Данный бот предназначен для записи твоих мыслей, эмоций, чувств и много другого. Добро пожаловать!\n"+
            "Вам доступны следующие команды:\n" +
            "/help - помощь\n" +
            "/new_record - создать новую запись\n" +
            "/edit_record - редактировать запись\n" +
            "/view_record - посмотреть старую запись\n" +
            "/view_all_records - мотреть все старые записи\n";
}
