package com.example.telegrambot.openai;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ChatCompletionObject {

    private final List<Choice> choices;

    public ChatCompletionObject() {
        choices = new ArrayList<>();
    }
}
