package com.chat_bot.components;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public class Buttons {
    private static final InlineKeyboardButton START_BUTTON = new InlineKeyboardButton("Start");
    private static final InlineKeyboardButton HELP_BUTTON = new InlineKeyboardButton("Help");
    private static final InlineKeyboardButton NEW_RECORD_BUTTON = new InlineKeyboardButton("New record");
    private static final InlineKeyboardButton EDIT_RECORD_BUTTON = new InlineKeyboardButton("Edit record");
    private static final InlineKeyboardButton VIEW_RECORD_BUTTON = new InlineKeyboardButton("View record");
    private static final InlineKeyboardButton VIEW_ALL_RECORD_BUTTON = new InlineKeyboardButton("View all record");

    public InlineKeyboardMarkup getInlineMarkup() {
        START_BUTTON.setCallbackData("/start");
        HELP_BUTTON.setCallbackData("/help");
        NEW_RECORD_BUTTON.setCallbackData("/new_record");
        EDIT_RECORD_BUTTON.setCallbackData("/edit_record");
        VIEW_RECORD_BUTTON.setCallbackData("/view_record");
        VIEW_ALL_RECORD_BUTTON.setCallbackData("/view_all_record");

        List<InlineKeyboardButton> rowInlineFirst = List.of(START_BUTTON, HELP_BUTTON);
        List<InlineKeyboardButton> rowInlineSecond = List.of(NEW_RECORD_BUTTON, EDIT_RECORD_BUTTON);
        List<InlineKeyboardButton> rowInlineThird = List.of(NEW_RECORD_BUTTON, EDIT_RECORD_BUTTON);

        List<List<InlineKeyboardButton>> rowsInLineFirst = List.of(rowInlineFirst);
        List<List<InlineKeyboardButton>> rowsInLineSecond = List.of(rowInlineSecond);
        List<List<InlineKeyboardButton>> rowsInLineThird = List.of(rowInlineThird);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInLineFirst);
        markupInline.setKeyboard(rowsInLineSecond);
        markupInline.setKeyboard(rowsInLineThird);

        return markupInline;
    }
}
