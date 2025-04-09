package ex_09_Switch;

import java.util.Scanner;

public class Real_Switch_Automation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name:");
        String browser = scanner.next();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome ...");
                System.out.println("....");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                System.out.println("...");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("execute the edge code");
            default:
                System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
