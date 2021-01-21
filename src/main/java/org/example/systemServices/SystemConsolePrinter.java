package org.example.systemServices;

public class SystemConsolePrinter implements PrinterService {

    @Override
    public void print(String string) {

        System.out.println(string);
    }
}
