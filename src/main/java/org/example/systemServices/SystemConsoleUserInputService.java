package org.example.systemServices;

import java.io.*;
import java.util.*;

public class SystemConsoleUserInputService {

    private final InputStream inputStream;

    public SystemConsoleUserInputService() {

        this.inputStream = System.in;
    }

    public String readInput() {

        Scanner scanner = new Scanner(inputStream);
        return scanner.nextLine();
    }
}
