package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cats {
    public String id;
    public String text;
    public String type;
    public int upvotes;

    public Cats(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public int getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "{" +
                "\n\"id\": \"" + id + "\"" +
                ", \n\"text\": \"" + text + '\"' +
                ", \n\"type\": \"" + type + '\"' +
                ", \n\"upvotes\": \"" + upvotes + '\"' +
                '}';
    }
}
