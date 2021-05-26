package com.github.durakin.oop.sem2.lab4;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ConsoleUI {

    private static ConsoleUI uniqueInstance;
    private final Scanner scanner;

    private ConsoleUI() {
        scanner = new Scanner(System.in);
        uniqueInstance = this;
    }

    public static ConsoleUI getInstance() {
        return uniqueInstance == null ? new ConsoleUI() : uniqueInstance;
    }

    private Integer askCardNumber() {
        System.out.println("Enter party member card number:");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Wrong card number format");
            }
        }
    }

    private String askString(String stringToOutput) {
        System.out.println("Enter " + stringToOutput + " :");
        return scanner.nextLine();
    }

    private String waitForCommand(String stringToOutput, List<String> listOfCommands) {
        System.out.println(stringToOutput);
        while (true) {
            String readLine = scanner.nextLine();
            for (String command : listOfCommands) {
                if (command.equals(readLine)) {
                    return readLine;
                }
            }
        }
    }

    public void runInterface() {
        List<String> listOfCommands = new ArrayList<>();
        listOfCommands.add("Add member");
        listOfCommands.add("Register property");
        listOfCommands.add("Get report");
        listOfCommands.add("Quit");

        String menu = "LIST OF COMMANDS:\n" +
                "Add member\n" +
                "Register property\n" +
                "Get report\n" +
                "Quit\n";
        String readCommand;
        do {
            readCommand = waitForCommand(menu, listOfCommands);
            if (readCommand.equals("Add member")) {
                String name = askString("name");
                String lastname = askString("lastname");
                System.out.println("Member added, party card number: " + Controller.getInstance().addMember(name, lastname));
            }

            if (readCommand.equals("Register property")) {
                int cardNumber = askCardNumber();
                String assetDocumentCode = askString("asset document code");
                if (Controller.getInstance().addProperty(cardNumber, assetDocumentCode)) {
                    System.out.println("Property added");
                } else {
                    System.out.println("Member not found");
                }
            }

            if (readCommand.equals("Get report")) {
                int cardNumber = askCardNumber();
                String report = Controller.getInstance().partyMemberReportByCard(cardNumber);
                System.out.println(Objects.requireNonNullElse(report, "No such member"));
            }

        }
        while (!readCommand.equals("Quit"));
    }
}
