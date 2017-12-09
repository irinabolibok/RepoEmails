package com.irynaderezhenets.emails;

public class ConfirmEmail extends AbstractEmail {
    private String password;

    public ConfirmEmail(String title, String content, String password) {
        super(title, content);
        this.password=password;
    }

    public void sendEmail() {
        System.out.println(String.format("Confirm  Email title: %s, content: %s, password:%s", title, content, password));
    }
}
