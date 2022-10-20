package com.company;

public class Bankaccount {
    int id = 10;
    String name = "Petr";
    double Balance = 100.00;




}


class BankAccountTest {

    public static void main(String[] args) {
        Bankaccount MyAccount = new Bankaccount();
        Bankaccount YourAccount = new Bankaccount();
        Bankaccount HisAccount = new Bankaccount();

        MyAccount.id = 1;
        MyAccount.name = "Dima";
        MyAccount.Balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.Balance = 2.00;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.Balance = 124.12;

        System.out.println(HisAccount.Balance);


    }
}
