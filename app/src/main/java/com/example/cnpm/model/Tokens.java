package com.example.cnpm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tokens {
    @SerializedName("accesstoken")
    @Expose
    private String accesstoken;
    @SerializedName("refreshtoken")
    @Expose
    private String refreshtoken;
    public Tokens(String accesstoken, String refreshtoken) {
        this.accesstoken = accesstoken;
        this.refreshtoken = refreshtoken;
    }

    public String getAccesstoken() {
        return accesstoken;
    }

    public void setAccesstoken(String accesstoken) {
        this.accesstoken = accesstoken;
    }

    public String getRefreshtoken() {
        return refreshtoken;
    }

    public void setRefreshtoken(String refreshtoken) {
        this.refreshtoken = refreshtoken;
    }
}
