public class MethodOverloading {
    public void sum(){
        System.out.println("Sum is "+(3+5));
    }
    public void sum(int a){
        System.out.println("Sum is "+(a+a));
    }
    public void sum(int a, int b){
        System.out.println("Sum is "+(a+b));
    }
    public void sum(double a, double b){
        System.out.println("Sum is "+(a+b));
    }

    public static void main(String[] args) {
        MethodOverloading ob=new MethodOverloading();
        ob.sum();
        ob.sum(2);
        ob.sum(5,2);
        ob.sum(3.5,2.7);
    }
}
