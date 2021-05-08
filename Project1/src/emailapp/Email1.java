package emailapp;

public class Email1 {
	
	public static void main(String[]args)
	{
		Email em1=new Email("Pooja" , "Mandal");
		
		em1.setAlternateEmail("pooja321mandal@gmail.com");
		System.out.println(em1.getAlternateEmail());
		System.out.println(em1.showInfo());
		//em1.setMailboxCapacity(0);
	}

}
