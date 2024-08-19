package com.example.telegrambot.openai;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public record ChatCompletionObject(

        @JsonProperty("choices") List<Choice> choices
) {}

