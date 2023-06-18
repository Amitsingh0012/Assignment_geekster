package org.mailMetaData;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.example.MailMetaData;



public class CustomizedMailAuthentication extends Authenticator {

    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication(MailMetaData.myUserMail,MailMetaData.password);
    }
}