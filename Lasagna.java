public class Lasagna {
    public static int expectedMinutesInOven() {
        return 40;
    }

    public static int remainingMinutesInOven(int actualMins){
        return expectedMinutesInOven()-actualMins;
    }

    public static int preparationTimeInMinutes(int numberLayers) {
        return numberLayers * 2;
    }

    public static int totalTimeInMinutes(int numberLayers, int mins){
        return preparationTimeInMinutes(numberLayers) + mins ;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.totalTimeInMinutes(3,20));
    }
}
