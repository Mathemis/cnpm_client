package com.example.cnpm.model;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Body {
    @SerializedName("tokens")
    @Expose
    private Tokens tokens;
    @SerializedName("user")
    @Expose
    private User user;
    public Body(Tokens tokens, User user) {
        this.tokens = tokens;
        this.user = user;
    }

    public Tokens getTokens() {
        return tokens;
    }

    public void setTokens(Tokens tokens) {
        this.tokens = tokens;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}