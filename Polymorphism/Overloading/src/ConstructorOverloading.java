public class ConstructorOverloading {
    int a,b;
    public ConstructorOverloading(){
        a=0;
        b=0;
        System.out.println("In Constructor with no parameters, value of a is "+ a+" and value of b is "+b);
    }
    public ConstructorOverloading(int a){
        this.a=a;
        b=0;
        System.out.println("In Constructor with one parameters, value of a is  "+ a+" and value of b is "+b);
    }
    public ConstructorOverloading(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("In Constructor with one parameters, value of a is  "+ a+" and value of b is "+b);
    }

    public static void main(String[] args) {
        new ConstructorOverloading();
        new ConstructorOverloading(5);
        new ConstructorOverloading(3,2);
    }
}
