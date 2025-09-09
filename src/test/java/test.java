import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class ASATest {

    @Test
    public void testPointageRouge(){
        Prestataire p = new Prestataire(1, "Doe", "John", "Rakoto@gmail.com", 100);
        LocalDate d1 = LocalDate.of(2023, 10, 1);


        p.ajouterPointage(new Pointage(d1, TypeTravail.ENSEIGNEMENET,0.5, "Cours java" , "bleu"));
        p.ajouterPointage(new Pointage(d1, TypeTravail.ADMINISTRATION,0.5, "Reunion" , "rouge"));

        assertTrue(ASAred.pointageRouge(p, d1)); 
    }

    @Test
    public void testGetDayRed(){
        prestataire p = new Prestataire(1, "Doe", "John", "rajao@gmail.com","0341252401" ,100 );
        LocalDate d1 = LocalDate.of(2023, 10, 1);
        LocalDate d2 = LocalDate.of(2023, 10, 2);
        LocalDate d3 = LocalDate.of(2023, 10, 3);


        p.ajouterPointage(new Pointage(d1, TypeTravail.ENSEIGNEMENET,0.5, "Cours java" , "bleu"));
        p.ajouterPointage(new Pointage(d2, TypeTravail.ADMINISTRATION,0.5, "Reunion" , "rouge"));
        p.ajouterPointage(new Pointage(d3, TypeTravail.RD,1, "Recherche" , "rouge"));

        assertEquals(2, ASAred.getDayRed(p , d1, d3));
    }

    @Test
    public void testCalculerSalairePrestataire(){
        Prestataire p = new Prestataire(1, "Doe", "John", "rakoto@gmail.com" , "0345218580", 100);
        LocalDate d1 = LocalDate.of(2023, 10, 1);
        LocalDate d3 = LocalDate.of(2023, 10, 3);


        p.ajouterPointage(new Pointage(d1, TypeTravail.ENSEIGNEMENET,0.5, "Cours java" , "bleu"));
        p.ajouterPointage(new Pointage(d3, TypeTravail.ADMINISTRATION,0.5, "Reunion" , "rouge"));
    }
            
    
    assertEquals(200, ASAred.calculerSalairePrestataire(p, d1, d3));

}