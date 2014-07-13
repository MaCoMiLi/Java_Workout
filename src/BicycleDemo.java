public class BicycleDemo {
    public static void main (String []args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadance(25);
        bike1.speedUp(50);
        bike1.changeGear(2);
        bike1.applyBrake(30);
        bike1.printStates();

        bike2.changeCadance(60);
        bike2.speedUp(70);
        bike2.changeGear(1);
        bike2.applyBrake(2);
        bike2.printStates();
    }


}
