class P{
    public void marry()
    {
        System.out.println("I am P");
    }
}
class S extends P{
    public void marry()
    {
        System.out.println("I am S");
    }
}
public class LearnInheri {
    public static void main(String[] args)
    {
    P p= new S();
    p.marry();

    }
}
