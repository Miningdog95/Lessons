package com.company;

public class BankAc1 {
    int id = 10;
    String name = "Petr";
    double Balance = 100.00;
    double popolnenieScheta(double x) {
        double popolnenieScheta = Balance + x;
        return popolnenieScheta;
    }
    double snyatieScheta(double y){
        double snyatieScheta = Balance - y;
        return snyatieScheta;
    }
}

class BankAccountTest1 {

    public static void main(String[] args) {

        BankAc1 MyAccount = new BankAc1();
        BankAc1 YourAccount = new BankAc1();
        BankAc1 HisAccount = new BankAc1();

        MyAccount.id = 1;
        MyAccount.name = "Dima";
        MyAccount.Balance = 12.35;
        System.out.println(MyAccount.popolnenieScheta(15));
        System.out.println(MyAccount.snyatieScheta(20));

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.Balance = 2.00;
        System.out.println(YourAccount.popolnenieScheta(15));
        System.out.println(YourAccount.snyatieScheta(1.5));

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.Balance = 124.12;
        System.out.println(HisAccount.popolnenieScheta(15));
        System.out.println(HisAccount.snyatieScheta(250.46));

    }
}
