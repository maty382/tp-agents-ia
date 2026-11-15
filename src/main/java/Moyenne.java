public class Moyenne {
    public static double calculer(double[] notes) {
        // Vérifie si le tableau est vide
        if (notes.length == 0) {
            // Si le tableau est vide, retourne 0
            return 0;
        }
        // Calcul de la somme des notes
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        // Calcul de la moyenne
        double moyenne = somme / notes.length;
        // Retourne la moyenne
        return moyenne;
    }

    public static String mention(double moyenne) {
        // Vérifie si la moyenne est supérieure ou égale à 10
        if (moyenne >= 10) {
            // Si la moyenne est supérieure ou égale à 10, retourne "Admis"
            return "Admis";
        } else {
            // Sinon, retourne "Refuse"
            return "Refuse";
        }
    }
}