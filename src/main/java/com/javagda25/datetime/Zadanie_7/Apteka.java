package com.javagda25.datetime.Zadanie_7;

import java.time.LocalDateTime;
import java.util.List;

public class Apteka {
    List<Customer> customerList;





    public void dodajDoKolejki(Customer customer){
        customer.setDataDolaczenia(LocalDateTime.now());
        customerList.add(customer);
    }
    public void wylistujKolejke(){
        for(Customer customer: customerList){
            System.out.println(customer);
        }
    }

}
