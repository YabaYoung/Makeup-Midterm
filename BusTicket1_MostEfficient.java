/*
Name; Jiayang Wu
Why this is the most efficient:
The program practices the concept of inheritance, which already makes the code less repetitive since we do not have to
reimplement everything everytime we create a new class. Inheritance provides subclass a template to go off of. The code
has a super class that already set the default values for the program. The program also uses abstract method in the
super class, allowing the subclasses to implement it in their class or override the method when they extend the super
class. Like I mentioned in the MostInefficient class, not using inheritance makes the code very repetitive and
inefficient. It also uses runtime polymorphism, which allows for method overriding, without runtime polymorphism we
would not be able to change the value in the Student class. Since this java file utilizes the concept of inheritance,
abstract class & methods, and runtime polymorphism it saves time and increase the reusability of the code. This is
why inheritance is so important in programs like this.

 */
abstract class Bus {

    private double fare = 3.0;
    private String color = "Red";

    public abstract String printTicket();

    public double getFare() {
        return fare;
    }

    public String getColor() {
        return color;
    }
}
class Student extends Bus{

    double discount = 0.5;
    String color = "Green";

    @Override
    public double getFare() {
        return discount * super.getFare();
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String printTicket() {
        return "Fare: " + getFare() + " " + "Color: " + getColor();
    }
}
class Adult extends Bus{

    public String printTicket() {
        return "Fare: " + getFare() + " " + "Color: " + getColor();
    }
}
public class BusTicket1_MostEfficient {

    public static void main(String[] args) {

        Bus Ed = new Student();
        Bus Amy = new Adult();
        System.out.println(Ed.printTicket());
        System.out.println(Amy.printTicket());
    }
}

