package TestClasses;

import bankAccount.Users;
import org.junit.Assert;


public class TransferOwnAccount {


    public static void main(String[] args) {

        Users u1 = new Users("Steven" , "Gerard", "10/02/2000", "married" ,1000 , 2000);

        u1.transfer(u1,u1);

        System.out.println(u1.toString());

        Assert.assertTrue("result should be 901 but your result is " +u1.amountAccount1 ,u1.amountAccount1==902);
        Assert.assertTrue("result should be 2099 but your result is " +u1.amountAccount2 , u1.amountAccount2==2098 );

        /*
      Do you want to add add your relative?
        Yes
        What is your relative name?
        gerry
        Date of birth relative?
        11/11/2002
        Do you want to transfer between your accounts or different user
        own
        Enter amount of money you want to enter
        100
         */


        /*

        Result should be:
        name: Steven
        password: Gerard
        dateOfBirth: You can get a credit card
        marriageStatus: Relative should be more then 18 years old
        accountNumber: 77650360
        amount in account 1 : 901
        accountNumber2: 95990730
        amount in account 2 : 2099
        relativeName: Relative should be more then 18 years old
        relativeAge: Relative should be more then 18 years old

         */
    }

}
