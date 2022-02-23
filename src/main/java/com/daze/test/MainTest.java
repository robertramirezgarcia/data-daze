package com.daze.test;

import com.daze.exception.ResourceNotFoundException;
import com.daze.model.Car;
import com.daze.service.impl.CarServiceImpl;

public class MainTest {

    public static void main(String[] args) {

        //In this section we will daze the cellphone number
        //The parenthesis character specific a group
        String reg = "^\\d+(\\d{2})$";
        String cad = "955622732";
        System.out.println(cad.replaceAll(reg, "*******$1"));

        //In this section we will daze the email
        String regex = "^([a-zA-Z0-9_\\-\\.]{2})[a-zA-Z0-9_\\-\\.]+(@[a-zA-Z0-9_\\-\\.]+\\.[a-zA-Z]{2,5})$";
        String cadena = "robert.ramirez.gr@gmail.com";
        System.out.println(cadena.replaceAll(regex, "$1************$2"));

        //In this section we will daze the credit card number
        String regCreditAccount = "^(\\d{4})\\d+(\\d{4})$";
        String cadCreditAccount = "1234567890123456";
        System.out.println(cadCreditAccount.replaceAll(regCreditAccount, "$1********$2"));

    }
}
