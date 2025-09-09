import java.time.LocalDate;

public class ASAred {
    public static boolean pointageRouge(Travalleur t , LocalDate date) {
        double total = 0;
        for (Pointage p : t.getPointages()) {
            if (p.getDate().equals(date)) {
                if (p.getQoata() <= 0 || p.getQoata() > 1) {
                    throw new IllegalArgumentException("Qoata invalide !");
                }
                total += p.getQoata();
            }
        }
        return total == 1.0;
}

public static long getDaysRed(Prestataire p , LocalDate debut , LocalDate fin) {
    return p.getTPointages().stream()
            .filter(pt -> !pt.getDate().isBefore(debut) && !pt.getDate().isAfter(fin))
            .filter(pt -> pt.getType() ! TypeTravail.ABS_NON_PAYE && pt.getType() != TypeTravail.ABS_PAYE)
            .map(Pointage::getDate)
            .distinct()
            .count();
}


public static double calculerSalairePrestataire(Prestataire p , LocalDate debut , LocalDate fin) {
    long jours = getDaysRed(p, debut, fin);
    return jours * p.getTJM();
}
}