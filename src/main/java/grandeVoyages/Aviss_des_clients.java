package grandeVoyages;

import java.time.LocalDate;
import java.util.List;

public class Aviss_des_clients {
    private String Name;
    private String email;
    private String Address_Hotel;
    private String description;
    private LocalDate Poste;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress_Hotel() {
        return Address_Hotel;
    }

    public void setAddress_Hotel(String address_Hotel) {
        Address_Hotel = address_Hotel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getPoste() {
        return Poste;
    }

    public void setPoste(LocalDate poste) {
        Poste = poste;
    }

    public Aviss_des_clients(String name, String email, String address_Hotel, String description, LocalDate poste) {
        Name = name;
        this.email = email;
        Address_Hotel = address_Hotel;
        this.description = description;
        Poste = poste;


    }

}