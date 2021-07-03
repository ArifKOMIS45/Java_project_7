package bankAccount;

import java.text.ParseException;

public class AddRelative {
    String fullName, age;

    public AddRelative(String fullName, String age) {
        this.fullName = fullName;
        if (relativeAgeChecker(age)) this.age = age;
        else this.age = "0";
    }

    boolean relativeAgeChecker(String relativeAge)  {
        boolean a;
        a = Users.checkAge(relativeAge).equalsIgnoreCase("You can get a credit card");
        return a;
    }

}
