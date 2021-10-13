import com.sun.jdi.PathSearchingVirtualMachine;

public class Main {

    //Enums are way to store a list of constants e.g. daysOfTheWeek.
    //enum for list of transports
    //the only transports available are this three declared

    enum Transports {
        PLANE, TRAIN, AUTOMOBILE
    }

    public static void main(String[] args) {

        //tp equals to automobile
        Transports tp= Transports.AUTOMOBILE;
    }
}
