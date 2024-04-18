package com.sparta.db.enums_kata;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class ATM {


    private int totalMoney;
    private LinkedHashMap<Money, Integer> atm = new LinkedHashMap<>();

    public ATM(){
        atm.put(Money.FIVE_HUNDRED, 2);
        atm.put(Money.TWO_HUNDRED, 1);
        atm.put(Money.ONE_HUNDRED, 2);
        atm.put(Money.FIFTY, 1);
        atm.put(Money.TWENTY, 3);
        atm.put(Money.TEN, 3);
        atm.put(Money.FIVE, 1);
        atm.put(Money.TWO, 5);
        atm.put(Money.ONE, 5);

        calculateATMTotalMoney();

    }

    // Private utility function to update the objects total money
    private void calculateATMTotalMoney(){
        int total = 0;

        for(Map.Entry<Money, Integer> bill : atm.entrySet()){
            Money money = bill.getKey();
            int billCount = bill.getValue();
            int billValue = money.getValue();
            total += billCount * billValue;
        }

        this.totalMoney = total;

    }


    // Public accessor to withdraw money from the atm
    public ArrayList<Money> withdraw(int amount) throws Exception {

        if(this.totalMoney < amount){
            throw new Exception("The ATM machine has not enough money, please go to the nearest atm machine");
        }


        ArrayList<Money> withdrawnMoney = new ArrayList<>();

        // Gets the nearest bill that is less than the amount parameter
        int nearestBillAmount = Money.moneyConvert.floorKey(amount);
        Money nearestBill = Money.moneyConvert.get(nearestBillAmount);

        // Loops until all bills have been added to withdrawnMoney, which should total to amount
        while (amount > 0){
            // Reinitializes nearestBill with new updated value
            nearestBillAmount = nearestBill.getValue();

            // Withdraws bill if there is a bill available
            if (canWithdraw(nearestBill)){
                withdrawnMoney.add(withdraw(nearestBill));
                amount -= nearestBillAmount;
                nearestBill = getNextAvailableBill(amount);

            }else {
                // If bill not available. Get next available bill
                nearestBill = getNextAvailableBill(Money.moneyConvert.floorKey(nearestBillAmount));
            }



        }
        // Used to recount the total money that is now left in the atm
        calculateATMTotalMoney();
        return withdrawnMoney;

    }

    // gets the next bill that is not larger than a given input
    // as long as there is a bill available in the atm HashMap
    private Money getNextAvailableBill(int maxBillAmount){
        for(Map.Entry<Money, Integer> bills : atm.entrySet()){
            int amountOfBills = bills.getValue();
            Money bill = bills.getKey();

            if(bill.getValue() <= maxBillAmount && amountOfBills > 0){
                return bill;
            }

        }

        // Will never
        return Money.ONE;
    }

    private boolean canWithdraw(Money money){
        return atm.get(money) > 0;
    }

    // Used to actually take Money out of atm Hashmap
    private Money withdraw(Money money){

        int newBillCount = atm.get(money);
        atm.put(money, newBillCount-1);
        return money;
    }

    public void setATMBillCount(Money money, int billCount){
        this.atm.put(money, billCount);
    }

    public int getBillAmount(Money money){
        return atm.get(money);
    }

}
