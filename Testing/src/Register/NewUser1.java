package Register;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class NewUser1 {
	
	public String Register(String email,String pass,String confirmPass) {
		String regex = "^[^ ]+@([^ ]+)$";
		String regex2 = "[^a-zA-Z0-9 ]";
			
		 
		Pattern email_pattern = Pattern.compile(regex);
		
		Pattern pass_pattern=Pattern.compile(regex2);
		
		Matcher email_matcher = email_pattern.matcher(email);
		Matcher pass_matcher = pass_pattern.matcher(pass);
		
		if (pass.length()>=9  && pass.equals(confirmPass))
		{

		
		  if(email_matcher.matches() ==true && pass_matcher.matches())
			  return ("Registarrion done");
		  else
			  System.out.println(email +" : "+ email_matcher.matches());
		  System.out.println(pass +" : "+ pass_matcher.matches());

			  
			  return ("Registarrion fail");
		}
		return ("Registarrion fail");
			  
		
		
		
	

}
}
