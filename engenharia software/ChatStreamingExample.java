package io.github.ollama4j.examples;

import io.github.ollama4j.Ollama;
import io.github.ollama4j.models.chat.OllamaChatMessageRole;
import io.github.ollama4j.models.chat.OllamaChatRequest;
import io.github.ollama4j.models.chat.OllamaChatStreamObserver;
import io.github.ollama4j.models.generate.OllamaGenerateTokenHandler;

public class ChatStreamingExample {

    public static void main(String[] args) throws Exception {

        Ollama ollama = new Ollama("http://localhost:11434/");
        String model = "gemma3:270m";
        ollama.pullModel(model);
        OllamaChatRequest builder = OllamaChatRequest.builder().withModel(model);

        OllamaChatRequest chatRequest =
                builder.withMessage(
                                OllamaChatMessageRole.USER,
                                "Me fala tudo sobre a Faculdade Fatec SJC")
                        .build();

        // Define a stream observer.
        OllamaChatStreamObserver streamObserver = new OllamaChatStreamObserver();

        // If thinking tokens are found, print them in lowercase :)
        streamObserver.setThinkingStreamHandler(
                new OllamaGenerateTokenHandler() {
                    @Override
                    public void accept(String message) {
                        System.out.print(message.toUpperCase());
                    }
                });
        // Response tokens to be printed in lowercase
        streamObserver.setResponseStreamHandler(
                new OllamaGenerateTokenHandler() {
                    @Override
                    public void accept(String message) {
                        System.out.print(message.toLowerCase());
                    }
                });

        ollama.chat(chatRequest, streamObserver);
    }
}