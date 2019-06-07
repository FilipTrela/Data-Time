package com.javagda25.datetime.Zadanie_7;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data

public class Customer implements Comparable<Customer> {
    private int wiek;
    private boolean ciaza;
    private String imie;
    LocalDateTime dataDolaczenia = null;

    public Customer(int wiek, boolean ciaza, String imie) {
        this.wiek = wiek;
        this.ciaza = ciaza;
        this.imie = imie;
    }

    @Override
    public int compareTo(Customer o) {
        if (ciaza && !o.ciaza) {
            return 1;
        } else if (!ciaza && o.ciaza) {
            return -1;
        }
        if (wiek > 60 && o.getWiek() < 60) {
            return 1;
        } else if (wiek < 60 && o.getWiek() > 60) {
            return -1;
        }
        if (this.dataDolaczenia.isAfter(o.dataDolaczenia)) {
            return -1;
        } else if (this.dataDolaczenia.isBefore(o.dataDolaczenia)) {
            return 1;
        }
        return 0;
    }
}
