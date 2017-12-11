package com.irynaderezhenets.emails;

public abstract class AbstractEmail {
    protected String title;
    protected String content;
    public abstract void sendEmail();

    public void sendEmailFormat(String title, String content) {
        System.out.println(String.format("InfoEmail title: %s, content: %s", title, content));
    }

    public AbstractEmail(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
