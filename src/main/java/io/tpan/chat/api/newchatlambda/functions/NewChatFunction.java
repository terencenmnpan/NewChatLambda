package io.tpan.chat.api.newchatlambda.functions;

import io.tpan.chat.api.newchatlambda.entities.Chat;
import io.tpan.chat.api.newchatlambda.services.ChatServices;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

public class NewChatFunction {
    private final ChatServices chatServices;

    public NewChatFunction(ChatServices chatServices) {
        this.chatServices = chatServices;
    }

    @Bean
    public Consumer<Chat> newChat(){
        return chatServices::insertChat;
    }
}
