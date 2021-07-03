public class Test {
    public static void main(String[] args) {
        System.out.println("---ClientService   Test    ---");
        ClientService p1= new ClientService(5);
        p1.add("lily");
        p1.add("coco");
        p1.add("david");
        p1.add("peter");
        System.out.println(p1.add("luc"));
        System.out.println("The next client is:"+p1.getNext());

        System.out.println("---ShoppingBag   Test    ---");
        ShoppingBag list2=new ShoppingBag(10);
        list2.add("TV");
        list2.add("bag");
        list2.add("cup");
        System.out.println( list2.add("pen"));
        System.out.println(list2.getNext());

        System.out.println("---DeansList   Test    ---");
        DeansList p = new  DeansList();
        Student p2=new Student("lucy",3.8);
        Student p3=new Student("lin",3.6);
        Student p4=new Student("jerry",3.9);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        System.out.println(p.getNext());
        System.out.println(p.getNext());
        System.out.println(p.getNext());



    }
}
