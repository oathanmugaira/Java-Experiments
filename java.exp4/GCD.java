package skll_oopm_b2;

//Name:- Pathan Mugaira Zakeer
//Div A
//UIN:- 231P084
public class GCD {

    private int num1;
    private int num2;
    private int gcd;

    
    public GCD() {
        this.num1 = 0;
        this.num2 = 0;
        this.gcd = 0;
    }

    
    public void setNumbers(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    
    public void calculate() {
        int a = num1;
        int b = num2;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        this.gcd = a;
    }

    
    public void display() {
        System.out.println("The Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static void main(String[] args) {
       
        GCD calculator = new GCD();

        
        calculator.setNumbers(48, 62);

        calculator.calculate();
        
        calculator.display();
    }
}


