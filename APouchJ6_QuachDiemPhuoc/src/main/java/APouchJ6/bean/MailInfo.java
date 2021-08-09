package APouchJ6.bean;

import APouchJ6.bean.MailInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailInfo {
	String from;
	String to;
	String[] cc;
	String[] bcc;
	String subject;
	String body;
	String[] attachments;
	
	public MailInfo(String to, String subject) {
		super();
		this.from = "APouch - Login eCommerce.";
		this.to = to;
		this.subject = "Dear. "+subject;
		this.body = "password is 123";
	}
}
