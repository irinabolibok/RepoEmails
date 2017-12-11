package com.irynaderezhenets.emails;

public class ConfirmEmail extends AbstractEmail {
    private String password;

    public ConfirmEmail(String title, String content, String password) {
        super(title, content);
        this.password=password;
    }

    public void sendEmail() {
        super.sendEmailFormat(title, content);
    }
}
