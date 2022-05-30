package com.interview.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface CreditCard{
        public String getCreditcard();
}
class Score implements CreditCard{
    @Override
    public String getCreditcard() {
        return "101";
    }
}

interface bank{
    void getCrd();
}


class ICICI implements  bank{
    @Override
    public void getCrd() {

    }
}
class CustomerDetail{
    List<CreditCard> creditCards = new ArrayList<>();

    void addCard(CreditCard  card){
        creditCards.add(card);
    }

    List<String> getCards(){
        return creditCards.stream().map(CreditCard::getCreditcard).collect(Collectors.toList());
    }

}

public class AdapterDesignPatten {

    public static void main(String args[]){
        CustomerDetail  detail = new CustomerDetail();
        //detail.addCard(new SBI());
        //detail.addCard(new ICICI());
        //System.out.println(detail.getCards());
    }
}
