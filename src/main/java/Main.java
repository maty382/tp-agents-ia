public class Main {
    public static void main(String[] args) {
        double m = Moyenne.calculer(new double[]{12, 8, 15});
        System.out.println("Application demarree. Moyenne = " + m + " -> " + Moyenne.mention(m));
    }
}
