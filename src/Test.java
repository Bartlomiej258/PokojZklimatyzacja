public class Test {
    public static void main(String[] args) {
        Room room = new Room(18,true,16);
        Room room1 = new Room(15,true,16);



        boolean isAirConditioning = room.hasAirConditioning();
        System.out.println("Is air conditioning: " + isAirConditioning);
        boolean decreaseTemperature = room.decreaseTemperature();
        System.out.println("Is temperature reduced: " + decreaseTemperature);

        boolean isAirConditioning1 = room1.hasAirConditioning();
        System.out.println("Is air conditioning: " + isAirConditioning1);
        boolean decreaseTemperature1 = room1.decreaseTemperature();
        System.out.println("Is temperature reduced: " + decreaseTemperature1);
    }
}
