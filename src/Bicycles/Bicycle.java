package Bicycles;

/**
 * Created by anil on 13.07.2014.
 */
public class Bicycle {

    int cadance = 0;
    int gear = 1;
    int speed = 0;

    void changeCadance (int newValue){
        cadance = newValue;
    }

    void changeGear (int newValue){
        gear = newValue;
    }

    void speedUp (int increment){
        speed = speed + increment;
    }

    void speedBrake (int decrement){
        speed = speed - decrement;
    }

    void printStates(){
        System.out.println("Cadance:" + cadance + " Gear:" + gear + " Speed:" + speed);
    }
}
