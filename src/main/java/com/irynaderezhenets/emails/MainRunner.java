package com.irynaderezhenets.emails;

public class MainRunner {
    public static void main(String[] args) {
        SMTPServer smtpServer = new SMTPServer();
        WelcomeEmail welcomeEmail = new WelcomeEmail("WelcomeEmail", "WelcomeEmailContent");
        ConfirmEmail confirmEmail = new ConfirmEmail("Confrim Email","ConfirmEmailContent", "Password");
        GenericEmail genericEmail = new GenericEmail("GenericEmail", "GenericEmailContent");
        InfoEmail infoEmail = new InfoEmail("TitleInfoEmail", "ContentInfoEmail");

        smtpServer.addEmail(welcomeEmail);
        smtpServer.addEmail(confirmEmail);
        smtpServer.addEmail(genericEmail);
        //smtpServer.showInfoEmailDetails(infoEmail);
       smtpServer.sendAllEmails();
      //  smtpServer.removeWelcomeEmail(welcomeEmail);

    }
}
