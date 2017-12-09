package com.irynaderezhenets.emails;

public class MainRunner {
    public static void main(String[] args) {
        SMTPServer smtpServer = new SMTPServer();
        WelcomeEmail welcomeEmail = new WelcomeEmail("com.irynaderezhenets.emails.WelcomeEmail", "WelcomeEmailContent");
        ConfirmEmail confirmEmail = new ConfirmEmail("Confrim Email","ConfirmEmailContent", "Password");
        GenericEmail genericEmail = new GenericEmail("com.irynaderezhenets.emails.GenericEmail", "GenericEmailContent");

        smtpServer.addWelcomeEmail(welcomeEmail);
        smtpServer.addConfirmEmail(confirmEmail);
        smtpServer.addGenericEmail(genericEmail);
        smtpServer.sendAllEmails();
      //  smtpServer.removeWelcomeEmail(welcomeEmail);

    }
}
