 interface Animalll {
    void eat();
}
 class Monkey implements Animalll{

    @Override
    public void eat() {
        System.out.println("Monkey is eating a banana!");
    }
}
public class Animall {  //only 1 class/interface can be public
    public static void main(String[] args) {
        Monkey myMonkey = new Monkey();
        myMonkey.eat();
    }
}
