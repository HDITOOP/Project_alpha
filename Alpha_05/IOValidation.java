/********************************************
* Project Team:	
* Students: 
* Couse: OOP 2015 Sem 1, HDIT
*
* IOValidation.java: 
********************************************/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

class IOValidation{

	public static void main(String[] args) {
        System.out.println(IOValidation.stringValid(""));
        System.out.println(IOValidation.stringValid("APPAP"));
        System.out.println(IOValidation.stringValid("12312312516"));
        System.out.println(IOValidation.stringValid("APP12412AP"));
        System.out.println(IOValidation.stringValid("!@#!%#$%"));

        ArrayList<String> emails = new ArrayList<String>();
        emails.add("user@domain.com");
        emails.add("user@domain.co.in");
        emails.add("user1@domain.com");
        emails.add("user.name@domain.com");
        emails.add("user#@domain.co.in");
        emails.add("user@domaincom");
        emails.add("Eric_is_ON79@yahoo.com.hk");
        emails.add("Eric_is_ON79@yahoo.com");
        emails.add("Eric_is_ON79@yahoo.com.");
        emails.add("Eric_is_ON79@yahoo.com.uk");
         
        //Invalid emails
        emails.add("user#domain.com");
        emails.add("@yahoo.com");
 
        for(int i = 0; i < emails.size(); i++){
            String email = emails.get(i);
            System.out.println(email +" : "+ IOValidation.emailValid(email));

        }
	}
	
	public static boolean stringValid(String inStr) {
		if(inStr.isEmpty()){
			return false;
		} else if(!inStr.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			return false;
		}
		return true;
	}

    public static boolean emailValid(String inStr) {
        String regex = "^[a-zA-Z0-9._]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";  // set the regex
        Pattern pattern = Pattern.compile(regex);   // compile the pattern
        Matcher matcher = pattern.matcher(inStr);   // validate the email
        if(matcher.matches())
            return true;
        else
            return false;
    }

}