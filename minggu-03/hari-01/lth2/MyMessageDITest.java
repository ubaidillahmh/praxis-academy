public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Debu";
		String email = "debubed@gmai.com";
		String phone = "085733175155";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}