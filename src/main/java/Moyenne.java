// public class Moyenne {
//     /**
//      * Calculer la moyenne des notes.
//      * 
//      * @param notes tableau de notes
//      * @return la moyenne des notes, ou 0 si le tableau est vide
//      */
//     public static double calculer(double[] notes) {
//         if (notes.length == 0) {
//             return 0;
//         }
//         double somme = 0;
//         for (double note : notes) {
//             somme += note;
//         }
//         return somme / notes.length;
//     }

//     /**
//      * Retourner la mention en fonction de la moyenne.
//      * 
//      * @param moyenne la moyenne des notes
//      * @return "Admis" si la moyenne est supérieure ou égale à 10, sinon "Refuse"
//      */
//     public static String mention(double moyenne) {
//         if (moyenne >= 10) {
//             return "Admis";
//         } else {
//             return "Refuse";
//         }
//     }
// }




public class Moyenne {

    // Calcule la moyenne d'un tableau de notes (0 si le tableau est vide)
    public static double calculer(double[] notes) {
        if (notes == null || notes.length == 0) {
            return 0.0;
        }
        double somme = 0;
        for (double note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }

    // Donne la mention : Admis si la moyenne est >= 10, sinon Refuse
    public static String mention(double moyenne) {
        return moyenne > 10 ? "Admis" : "Refuse";
    }
}
