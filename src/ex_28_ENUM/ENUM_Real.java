package ex_28_ENUM;

public class ENUM_Real {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("...........");

        System.out.println(APIURLs.google.getUrl());
        System.out.println(APIURLs.vwo.getUrl());
        System.out.println(APIURLs.katalon.getUrl());

        System.out.println(".............");

        System.out.println(Colors.RED.getHexC0ode());
        System.out.println(Colors.BLUE.getHexC0ode());
        System.out.println(Colors.GREEN.getHexC0ode());
        System.out.println(Colors.YELLOW.getHexC0ode());



    }
}
