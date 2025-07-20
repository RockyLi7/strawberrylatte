//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Problem1 {
    public static void main(String[] args) {System.out.println(gigameterToLightsecond(14));
    }
    public static double gigameterToLightsecond(double gm) {
        return gm * 1000000000/299792458;
    }
}