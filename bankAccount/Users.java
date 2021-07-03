package bankAccount;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Users {

    public String name, password, dateOfBirth, marriageStatus, relativeName, relativeAge, isTransferedSuceesfully;
    public int accountNumber, amountAccount1, accountNumber2, amountAccount2;

    public Users(String name, String password, String dateOfBirth, String marriageStatus, int amountAccount1, int amountAccount2)  {
        this.name = name;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.marriageStatus = CheckMariageStatus(marriageStatus);
        this.accountNumber = randomNumberCreader();
        this.accountNumber2 = randomNumberCreader();
        this.amountAccount1 = amountAccount1;
        this.amountAccount2 = amountAccount2;
    }

    public static String checkAge(String myDOB) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.parse(myDOB,formatter);

        today.format(formatter);
        Period age = Period.between(birth,today);
        String  mesaj="";

        if (age.getYears()>=18)  mesaj= "You can get a credit card";
        if (age.getYears()<18)   mesaj = "You should be at least 18 years old to get a credit card.";

        return mesaj;

    }

    private static int randomNumberCreader() {
        return (int) (Math.random() * 100000000) + 10000000;
    }

    public String CheckMariageStatus(String marriageStatus)  {
        Scanner scan = new Scanner(System.in);
        String sonuc = "";
        if (marriageStatus.equalsIgnoreCase("married"))
            System.out.print(" Do you want to add your relative?");
        String ans = scan.nextLine();

        if (ans.equalsIgnoreCase("yes")) {
            System.out.print("What is your relative name?: ");
            String rname = scan.nextLine();
            System.out.print("Date of birth relative?(day/mounth/year)");
            String rdob = scan.nextLine();
            AddRelative relative = new AddRelative(rname, rdob);
            if (relative.age.equalsIgnoreCase("0")) {
                relative.fullName = "Relative should be more then 18 years old";
                relative.age = "Relative should be more then 18 years old";
                sonuc = relativeAge;
            } else {
                relativeAge="Transaction done successfully";
                   sonuc =relativeAge; }
        }
        return sonuc;

    }


    public  static void transfer(Users u1,Users u2){
        Scanner sc = new Scanner(System.in);
        Scanner scInt = new Scanner(System.in);


        System.out.println("Do you want to transfer between your accounts or different user");
        String answer = sc.nextLine();

        if (answer.equals("own")){
            System.out.println("Kaç Para ");
            int para =scInt.nextInt();
            Account.transferToOwnAccount(u1,para);
        }else {
            System.out.println("Kaç Para ");
            int para =scInt.nextInt();
            Account.transferOtherUser(u1,u2,para);
        }

    }



    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", marriageStatus='" + marriageStatus + '\'' +
                ", relativeName='" + relativeName + '\'' +
                ", relativeAge='" + relativeAge + '\'' +
                ", isTransferedSuceesfully='" + isTransferedSuceesfully + '\'' +
                ", accountNumber=" + accountNumber +
                ", amountAccount1=" + amountAccount1 +
                ", accountNumber2=" + accountNumber2 +
                ", amountAccount2=" + amountAccount2 +
                '}';
    }
}


