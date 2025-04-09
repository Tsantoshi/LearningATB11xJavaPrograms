package ex_28_ENUM;

public class ENUM_Ex01 {
    public static void main(String[] args) {

        System.out.println(day.FRIDAY);
        System.out.println(Project_URLS.katalon);
    }
}

enum day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

enum Project_URLS{
    google, restassured, katalon, vwo;
}
