package grandeVoyages;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.PaddingLayout;
import java.util.List;
public class Hotel {
    private String name;
    private String coodonnees_geographique;
    private String description;
    private List<Chambres> chambres;
    private List<Aviss_des_clients> Aviss_des_clients;

    public Hotel(String coodonnees_geographique, String name, String description,
                 List<Chambres> chambres,
                 List<grandeVoyages.Aviss_des_clients> aviss_des_clients) {
        this.coodonnees_geographique = coodonnees_geographique;
        this.name = name;
        this.description = description;
        this.chambres = chambres;
        Aviss_des_clients = aviss_des_clients;
    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getCoodonnees_geographique() {
        return coodonnees_geographique;
    }

    public void setCoodonnees_geographique(String coodonnees_geographique) {
        this.coodonnees_geographique = coodonnees_geographique;




    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Chambres> getChambres() {
        return chambres;
    }

    public void setChambres(List<Chambres> chambres) {
        this.chambres = chambres;
    }

    public List<grandeVoyages.Aviss_des_clients> getAviss_des_clients() {
        return Aviss_des_clients;
    }

    public void setAviss_des_clients(List<grandeVoyages.Aviss_des_clients> aviss_des_clients) {
        Aviss_des_clients = aviss_des_clients;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", coodonnees_geographique='" + coodonnees_geographique + '\'' +
                ", description='" + description + '\'' +
                ", chambres=" + chambres +
                ", Aviss_des_clients=" + Aviss_des_clients +
                '}';
    }
}




