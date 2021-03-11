public class SpeedConverter {


    public static long toMilesPerHour(double kilometresPerHour) {

        if (kilometresPerHour < 0) {
            return -1;
        }
        return Math.round(kilometresPerHour / 1.609);


    }
    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour>=0) {
            System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
        }else{
            System.out.println("Invalid Value");
        }
    }
}
