package day07stringmanipulations;

public class Alternatives02 {
/* Alternative 1
String password = "MyPassword123";
boolean isValid = password.length() >= 8
                 && !password.contains(" ")
                 && password.replaceAll("[^A-Z]","").length() > 0
                 && password.replaceAll("[^a-z]","").length() > 0
                 && password.replaceAll("[^0-9]","").length() > 0;
System.out.println("Password is valid: " + isValid);
 */

/*alternative 2
Scanner scan = new Scanner(System.in);
String password, username;
System.out.println("Lütfen kullanıcı adınızı giriniz:");
username = scan.nextLine();
System.out.println("Lütfen şifrenizi giriniz:");
password = scan.nextLine();

boolean password1 = password.length() >= 8;
System.out.println("Password1 = " + password1);

boolean password2 = !password.contains(" ");
System.out.println("Password2 = " + password2);

Pattern pattern = Pattern.compile("[A-Z]");
Matcher matcher = pattern.matcher(password);
boolean password3 = matcher.find();
System.out.println("Password3 = " + password3);

pattern = Pattern.compile("[a-z]");
matcher = pattern.matcher(password);
boolean password4 = matcher.find();
System.out.println("Password4 = " + password4);

pattern = Pattern.compile("[0-9]");
matcher = pattern.matcher(password);
boolean password5 = matcher.find();
System.out.println("Password5 = " + password5);
 */

}
