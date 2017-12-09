package com.irynaderezhenets.emails;

import java.util.ArrayList;
import java.util.List;

public class SMTPServer {
    private List<WelcomeEmail> welcomeEmails = new ArrayList<WelcomeEmail>();
    private List<ConfirmEmail> confirmEmails = new ArrayList<ConfirmEmail>();
    private List<GenericEmail> genericEmails = new ArrayList<GenericEmail>();

    public void addGenericEmail(GenericEmail emailToAdd) {
        genericEmails.add(emailToAdd);
    }

    public void addConfirmEmail(ConfirmEmail emailToAdd) {
        confirmEmails.add(emailToAdd);
    }

    public void addWelcomeEmail(WelcomeEmail emailToAdd) {
        welcomeEmails.add(emailToAdd);
    }

    public void removeGenericEmail(GenericEmail emailToRemove) {
        genericEmails.remove(emailToRemove);
    }

    public void removeConfirmEmail(ConfirmEmail emailToRemove) {
        confirmEmails.remove(emailToRemove);
    }

    public void removeWelcomeEmail(WelcomeEmail emailToRemove) {
        welcomeEmails.remove(emailToRemove);
    }

    public void sendAllEmails() {
        welcomeEmails.forEach(WelcomeEmail::sendEmail);
        genericEmails.forEach(GenericEmail::sendEmail);
        confirmEmails.forEach(ConfirmEmail::sendEmail);
    }
}



