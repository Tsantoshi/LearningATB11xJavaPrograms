package ex_28_ENUM;

public enum Colors {

    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hexC0ode;

    Colors (String hexC0ode){
            this.hexC0ode = hexC0ode; // PC
    }

     String getHexC0ode() {
        return this.hexC0ode;
    }
}
