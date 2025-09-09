import java.util.Arraylist;
import java.util.List;

public class Travailleur {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private List<Promotion> promotions = new ArrayList<>();
    private List<Pointage> Pointages = new ArrayList<>();


    public Travailleur(int id, String nom, String prenom, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }


    public void ajouterPromotion(Promotion p) {promotions.add(p); }
    public void ajouterPointage(Pointage p) {pointages.add(p); }
    public List<Pointage> getPointageS() { return pointages; }

}