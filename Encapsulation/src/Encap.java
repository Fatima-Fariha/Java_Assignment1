public class Encap {
    public static void main(String[] args)
    {
        Student ob=new Student();

        System.out.println("Student name is "+ob.getName()+" and age is "+ob.getAge());
        ob.setName("Fariha");
        ob.setAge(22);
        System.out.println("Student name is "+ ob.getName() + " and age is "+ob.getAge());
    }
}
