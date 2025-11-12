package com.adrian.ejercicios.bank;

public class BankAccount {
    //Crea una clase BankAccount con el atributo privado balance. 
    //Implementa los métodos deposit(double amount) y withdraw(double amount) 
    //que validen las cantidades correctamente.
    private double balance;
    final double AMOUNT_MAX = 10_000_000;
    final double AMOUNT_MIN = 10_000;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double initialAmount) {
        balance = initialAmount;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            System.out.println("Los valores negativos o ceros no estan permitidos para esta transaccion");
            return;
        }
        
        if(amount >= AMOUNT_MAX) {
            System.out.println("La transaccion supera el monto maximo permitido");
            return;
        }

        balance += amount;
    }

    public double withdraw(double amount) {
        //Validar que no permita valores negativos, debe tener un monto minimo de retiro y 
        //validar que el monto sea multiplo de una denominacion 5k,10k,20k y 50k.
        if(amount <= 0) {
            System.out.println("Los valores negativos o ceros no estan permitidos para esta transaccion");
            return 0;
        }
        
        if(amount < AMOUNT_MIN) {
            System.out.println("La transaccion es menor del monto minimo para retirar");
            return 0;
        }

        if(!verificarDenominacion(amount)) {
            System.out.println("La transaccion a retirar no es una denominacion de 5k, 10k, 20k y 50k");
            return 0;
        }

        balance -= amount;
        return balance;
    }

    public double showBalance() 
    {
        return balance;
    }

    public boolean verificarDenominacion(double amount) {
        int[] denominacion = {5000, 10000, 20000, 50000};
        for (int i : denominacion) {
            if(amount % i == 0) {
                return true;
            }
        }
        return false;

    }
}
