package com.irynaderezhenets.emails;

public class WelcomeEmail extends AbstractEmail {

    public WelcomeEmail(String title, String content) {
        super(title, content);
    }

    public void sendEmail() {
        System.out.println(String.format("Welcome Email title: %s, content: %s", title, content));
    }
}
