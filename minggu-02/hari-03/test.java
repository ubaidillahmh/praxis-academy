public class Calculator {
    private int initVal = 5;
    public int sum(int a) {
       return initVal + a;
    }
}

class Main{
    
    public void main(String[] args) {
        Calculator data = new Calculator();

        System.out.println(data.sum());
    }
}