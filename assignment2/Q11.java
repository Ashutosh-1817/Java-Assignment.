package assignment2;

class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void showNum() {
        System.out.println("Decimal: " + number);
    }
}

class HexNum extends Num {
    HexNum(int number) {
        super(number);
    }

    @Override
    void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class Q11 {
    public static void main(String[] args) {
        HexNum hexNum = new HexNum(255);
        hexNum.showNum();
    }
}
