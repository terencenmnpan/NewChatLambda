package io.tpan.chat.api.newchatlambda.entities;

import java.time.Instant;

public class ChatMessage {
    private String chatMessageId;
    private String chatMessage;
    private Integer chatMessageScore;
    private String createdBy;
    private Instant createdOn;
    private boolean deletedFlag;

    public String getChatMessage() {
        return chatMessage;
    }

    public void setChatMessage(String chatMessage) {
        this.chatMessage = chatMessage;
    }

    public Integer getChatMessageScore() {
        return chatMessageScore;
    }

    public void setChatMessageScore(Integer chatMessageScore) {
        this.chatMessageScore = chatMessageScore;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public boolean isDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public String getChatMessageId() {
        return chatMessageId;
    }

    public void setChatMessageId(String chatMessageId) {
        this.chatMessageId = chatMessageId;
    }
}
