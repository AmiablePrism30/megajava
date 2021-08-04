package day14;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Day14_02 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("where to? ");
		String toemail=scanner.next();
		
		scanner.nextLine();
		
		System.out.println("Input title");
		String title=scanner.nextLine();
		
		System.out.println("Input Contents");
		String contents=scanner.nextLine();
		
		send_email(toemail,title,contents);
		
		
		
		
		
		
		
	}
	
	
	public static void send_email(String toemail,String title,String contents) {
		
		//String host="smtp.naver.com";
		String fromemail="";
		String frompassword="";
		//String toemail="spaf1208@naver.com";
		
		Properties properties=new Properties();
		
		properties.put("mail.smtp.host","smtp.naver.com");
		properties.put("mail.smtp.port",587);
		properties.put("mail.smtp.auth","true");
		
		
		Session session=Session.getDefaultInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromemail, frompassword);
				
			}
		});
		
		
		try {		
		
			MimeMessage message=new MimeMessage(session);		
			message.setFrom(new InternetAddress(fromemail));
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(toemail));
			message.setSubject(title);
			message.setText(contents);
			Transport.send(message);
			System.out.println("Success to send an email to "+toemail);
			
		}
		catch(Exception e) {
			System.out.println("Failed to send an email to " +toemail);
		}
		
		
		
	}
	

	

}
