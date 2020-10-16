public class Room<isAirConditioning> {
    double squareMeter;
    double temperature;
    boolean airConditioning;
    double limitTemperature;

    public Room(double temperature, boolean airConditioning, double limitTemperature) {
        this.temperature = temperature;
        this.airConditioning = airConditioning;
        this.limitTemperature = limitTemperature;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioning() {
        return airConditioning;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    boolean decreaseTemperature() {
        if ((temperature >= limitTemperature) && airConditioning){
            return true;
        }
        return false;
    }
    boolean hasAirConditioning(){
        if (airConditioning){
            return decreaseTemperature();
        }
        return false;
    }



}
