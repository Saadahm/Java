public class Teacher {
    String name;
    Teacher()
    {
        System.out.println("UI");
    }
//    Teacher(String name)
//    {
//        this.name=name;
//    }
    void sayhi() {
        System.out.println("hei");
    }
    void sayok(String x)
    {
        System.out.println(x);
    }
}
 class chil extends Teacher{
    chil(String name)
    {
        this.name=name;
//        super(name);  //works without sper as we have a no arg constructor in teacher, if we
        //remove that no arg then it ol fail

        System.out.println("OK");
    }
    void sayhi()
    {
        System.out.println("Heichil" + name);
    }
}

//class chil1 extends Teacher{
//    chil1(String name)
//    {
//        super(name);
//    }
//    void sayhi()
//    {
//        System.out.println("Heichil1");
//    }
//}