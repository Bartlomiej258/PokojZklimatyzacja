public class Room {

    private double squareMeter;
    private double temperature;
    private boolean airConditioning;
    private double limitTemperature;

    public Room(double temperature, boolean airConditioning, double limitTemperature) {
        this.squareMeter = squareMeter;
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

    public double getLimitTemperature() {
        return limitTemperature;
    }

    public void setLimitTemperature(double limitTemperature) {
        this.limitTemperature = limitTemperature;
    }

    boolean decreaseTemperature() {
        if ((getTemperature() >= getLimitTemperature()) && airConditioning) {
            return true;
        }
        return false;
    }

    boolean hasAirConditioning() {
        if (airConditioning) {
            return decreaseTemperature();
        }
        return false;
    }

    public double coolingRoom(double getSquareMeter) {
        if (getSquareMeter <= 30) {
            return getTemperature() - 6;
        } else if (getSquareMeter <= 50) {
            return getTemperature() - 3;
        } else if (getSquareMeter > 50) {
            return getTemperature() - 1;
        }
        return 0;
    }
}
