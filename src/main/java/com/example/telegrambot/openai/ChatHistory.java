package com.example.telegrambot.openai;

import lombok.Builder;
import com.example.telegrambot.openai.api.Message;

import java.util.List;

@Builder
public record ChatHistory(
        List<Message> chatMessages
) {
}