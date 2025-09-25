class Cooker {

    public static String powerOn(int wattage, String modelName, boolean isOn, float weight, short voltage) {
        if (!isOn) {
            isOn = true;
            return "Cooker " + modelName + " is now ON. Power: " + wattage + "W, Weight: " + weight + "kg, Voltage: " + voltage + "V";
        } else {
            return "Cooker " + modelName + " is already ON.";
        }
    }

    public static String setTemperature(int tempCelsius, boolean isHeating, String mode, double energyUsed, long id, char unit, byte step) {
        return "Temperature set to: " + tempCelsius + unit + " Heating: " + isHeating + " Mode: " + mode + " Energy Used: " + energyUsed + "kWh ID: " + id + " Step: " + step;
    }

    public static String startTimer(int minutes, boolean isTimerOn, String mode, float remainingTime, long timerId) {
        return "Timer Started: " + minutes + " mins, Timer On: " + isTimerOn + " Mode: " + mode + " Remaining: " + remainingTime + " mins, Timer ID: " + timerId;
    }

    public static String cookDish(String dishName, boolean isCooking, int heatLevel, byte recipeType, long cookerId) {
        return "Cooking Dish: " + dishName + " Heat Level: " + heatLevel + " Is Cooking: " + isCooking + " Recipe Type: " + recipeType + " Cooker ID: " + cookerId;
    }

    public static String connectApp(String appName, boolean isConnected, int signalStrength, double distance, char connectionType) {
        return "App Connected: " + appName + " Status: " + isConnected + " Signal Strength: " + signalStrength + " Distance: " + distance + " Type: " + connectionType;
    }

    public static void main(String[] args) {
        System.out.println(powerOn(1200, "InstantCook Pro", false, 7.5f, (short)220));
        System.out.println(setTemperature(180, true, "Bake", 1.5, 101L, 'C', (byte)2));
        System.out.println(startTimer(30, true, "Grill", 25.5f, 202L));
        System.out.println(cookDish("Lasagna", true, 5, (byte)1, 303L));
        System.out.println(connectApp("SmartCook App", true, 90, 10.0, 'W'));
    }
}