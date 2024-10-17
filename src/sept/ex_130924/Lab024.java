package sept.ex_130924;

public class Lab024 {
    public static void main(String[] args) {
        // Literals
        // 1. Boolean
        // 2. Integral
        // 3. Char
        // Single Char
        char c1='A';
        char c2='B';
        char c3='@';

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Mani" + new_line + "Megalai");
        System.out.println("Mani" + tab_line + "Megalai");
        System.out.println("Mani" + '\n'+ "Megalai");
        System.out.println("Mani" + back_space+ "Megalai");
        System.out.println("Mani" + car_r + "Megalai");

        char c12='\u1F60';
        System.out.println(c12);

    }
}

