package com.designpattern;

/**
 * Separate the construction of a complex object from its representation so that the same
 * construction process can create different representations.
 */

class Phone {
    private String price;
    private String os;

    public Phone(String price, String os) {
        this.price = price;
        this.os = os;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price='" + price + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}

class PhoneBuilder {
    private String price;
    private String os;

    public PhoneBuilder setPrice(String price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public Phone getPhone() {
        return new Phone(price, os);
    }
}

public class BuilderDesignPattern {
    public static void main(String arg[]) {


        Phone p = new PhoneBuilder().setOs("Andriod").getPhone();

        System.out.println(p.toString());

    }
}

