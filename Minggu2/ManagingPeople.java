
package Minggu_2;


public class ManagingPeople {
    public static void main(String[] args) {
        
        Person p1 = new Person("Joseph", 37);
        Person p2 = new Person("Arial", 15);
        
        
        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
        
    }
}
