package strategy;

import java.util.Scanner;

enum OperatorM {
    PLUS {
        @Override
        public int apply(int a, int b){
            return a+b;
        }
    },
    MINUS {
        @Override
        public int apply(int a, int b){
            return a-b;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int a, int b){
            return a*b;
        }
    },
    DIVIDE {
        @Override
        public int apply(int a, int b){
            return a/b;
        }
    };

    public abstract int apply(int a, int b);
}

public class CalculatorM {
    public static int calculate(int a, int b, OperatorM opcode){
        return opcode.apply(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수,정수,연산자");
        CalculatorM calculatorM = new CalculatorM();
        System.out.println(CalculatorM.calculate(sc.nextInt(),sc.nextInt(), OperatorM.valueOf(sc.next())));
    }

}
