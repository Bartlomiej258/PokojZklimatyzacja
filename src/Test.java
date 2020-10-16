public class Test {
    public static void main(String[] args) {
        Room room = new Room(18, true, 16);
        Room room1 = new Room(15, true, 16);
        Room room2 = new Room(25, true, 16);


        boolean isAirConditioning = room.hasAirConditioning();
        System.out.println("Is air conditioning: " + isAirConditioning);
        boolean decreaseTemperature = room.decreaseTemperature();
        System.out.println("Is temperature reduced: " + decreaseTemperature);

        System.out.println();

        boolean isAirConditioning1 = room1.hasAirConditioning();
        System.out.println("Is air conditioning: " + isAirConditioning1);
        boolean decreaseTemperature1 = room1.decreaseTemperature();
        System.out.println("Is temperature reduced: " + decreaseTemperature1);

        System.out.println();

        boolean isAirConditioning2 = room2.hasAirConditioning();
        System.out.println("Is air conditioning: " + isAirConditioning2);
        boolean decreaseTemperature2 = room2.decreaseTemperature();
        System.out.println("Is temperature reduced: " + decreaseTemperature2);

        System.out.println();

        double smallRoom = 25;
        double averageRoom = 45;
        double bigRoom = 70;

        double result = room.coolingRoom(smallRoom);
        System.out.println("Square meters " + smallRoom + " cools from " + room.getTemperature() + " to " + result);
        double result1 = room1.coolingRoom(averageRoom);
        System.out.println("Square meters " + averageRoom + " cools from " + room1.getTemperature() + " to " + result1);
        double result2 = room2.coolingRoom(bigRoom);
        System.out.println("Square meters " + bigRoom + " cools from " + room2.getTemperature() + " to " + result2);

    }
}

