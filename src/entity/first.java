package entity;

public class first {
    human human = new human();




    public static void main(String[] args) {
        System.out.println("hello world");
        human human = new human("Dima", 28);
        human.setAge(15);
        human.setName("Marat");
        System.out.println(new human("Dasha", 26));
        System.out.println(human);

        dog dog = new dog();
        System.out.println(new dog("malta", 3));
        System.out.println(123123123);
        System.out.println(12);
        System.out.println(123);
    }
}
