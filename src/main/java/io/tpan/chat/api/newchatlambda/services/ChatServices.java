package io.tpan.chat.api.newchatlambda.services;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import io.tpan.chat.api.newchatlambda.entities.Chat;
import org.springframework.stereotype.Service;

@Service
public class ChatServices {
    private final DynamoDBMapper dynamoDBMapper;

    public ChatServices(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public Chat insertChat(Chat chat){
        dynamoDBMapper.save(chat);
        return chat;
    }

}
