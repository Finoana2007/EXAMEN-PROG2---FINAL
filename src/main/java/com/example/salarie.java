public class Salarie {
    private double salaireMensuel;

    public Salarie(int id ; String nom, String prenom, double salaireMensuel, String email, String telephone) {
        super(id, nom, prenom, email , telephone);
        this.salaireMensuel = salaireMensuel;
    }

    public double getSalaireMensuel() {return salaireMensuel;}
}