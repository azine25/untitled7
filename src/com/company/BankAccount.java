package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum){
        return this.amount += sum;
    }

    public int withDraw(int sum) throws LimitException {
            if (sum > amount ){
                throw new LimitException("К сожалению у вас не достаточно суммы на болансе",amount);
            }
        return (int)(amount -= sum);

    }
}
