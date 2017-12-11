package com.irynaderezhenets.emails;

public class InfoEmail extends AbstractEmail {
    public InfoEmail(String title, String content) {
        super(title, content);
    }

    public void sendEmail() {
        System.out.println(String.format("InfoEmail title: %s, content: %s", title, content));
    }


}