package com.irynaderezhenets.emails;

import java.util.ArrayList;
import java.util.List;

public class SMTPServer {
    private List<AbstractEmail> abstractEmails = new ArrayList<AbstractEmail>();

    public void addEmail(AbstractEmail emailToAdd) {
        abstractEmails.add(emailToAdd);
    }

    public void removeEmail(AbstractEmail emailToRemove) { abstractEmails.remove(emailToRemove);
    }

    public void sendAllEmails() {
        abstractEmails.forEach(AbstractEmail::sendEmail);
            }

    public void showInfoEmailDetails(InfoEmail emailToShow) {
        System.out.println(emailToShow.getTitle()+" " + emailToShow.getContent());
            }

}



