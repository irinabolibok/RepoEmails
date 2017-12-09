package com.irynaderezhenets.emails;

public abstract class AbstractEmail {
    protected String title;
    protected String content;
    public abstract void sendEmail();

    public AbstractEmail(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
