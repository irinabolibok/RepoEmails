package com.irynaderezhenets.emails;

public class GenericEmail extends AbstractEmail {
    public GenericEmail(String title, String content) {

        super(title, content);
    }

    public void sendEmail() {
        System.out.println(String.format("Generic Email title: %s, content: %s", title, content));
    }
}
