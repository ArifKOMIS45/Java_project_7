package bankAccount;

public class Account {

    static int deposit(int accountAmount, int amountToAdd) {
        accountAmount += amountToAdd;
        return accountAmount;

    }

    static int withDraw(int accountAmount, int withdrawAmount) {
        accountAmount -= withdrawAmount;
        return accountAmount;
    }

    public static String transferOtherUser(Users sendingUser, Users receivingUser, int transferAmount) {
        String islem = "";
        int money = 0;
        if (transferAmount > sendingUser.amountAccount1) islem = "Sender is poor lol :)";
        else
            money = (int) (transferAmount - transferAmount * 0.02);
        sendingUser.amountAccount1 -= money;
        receivingUser.amountAccount2 += money;
        islem="Transaction is completed successfully";
        return islem;
    }

    public static String transferToOwnAccount(Users account,int transferAmount){
        String sonuc="";
        if (transferAmount>account.amountAccount1) sonuc="You need more money dude";
        else account.amountAccount1-=transferAmount;
        account.amountAccount2+=transferAmount;
        sonuc="Transaction is completed successfully";
        return sonuc;

    }



}












