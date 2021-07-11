package com.phone;

import com.phone.parts.*;

public class PhoneMaker {
    public static void main(String[] args) {
        MyPhone myPhone = new MyPhone();

        myPhone.hasFingerPrint = true;
        myPhone.price = 1999;
        myPhone.year = 2021;

        Mainboard mainboard = new Mainboard();
        mainboard.model = "EA3434";
        mainboard.year = 2021;
        mainboard.cpu = new CPU();
        mainboard.cpu.speed = 3.6;
        mainboard.memory = new Memory();
        mainboard.memory.capacity = 8;
        mainboard.storage = new Storage();
        mainboard.storage.capacity = 128;
    }
}
