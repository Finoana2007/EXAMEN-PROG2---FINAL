public class Pointage {
    private LocalDate date;
    private TypeTravail type;
    private double quota;
    private String description;
    private String couleur;


    public Pointage(LocalDate Date, TypeTravail type, double quota, String description, String couleur) {
        if(quota < 0 || quota >1 ) {
            throw new IllegalArgumentException("Le quota ne peut pas être négatif");
        }
        this.localDate = date;
        this.typeTravail = type;
        this.quota = quota;
        this.description = description;
        this.couleur = couleur;
    }

    public LocalDate getDate() {return date; }
    public TypeTravail getType() {return type; }
    public double getQuota() {return quota; }

}