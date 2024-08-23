package grandeVoyages;

public class Chambres {
    private  int Numero;
    private  double tarif_Par_Nuits;

    public Chambres(int numero, double tarif_Par_Nuits) {
        Numero = numero;
        this.tarif_Par_Nuits = tarif_Par_Nuits;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public double getTarif_Par_Nuits() {
        return tarif_Par_Nuits;
    }

    public void setTarif_Par_Nuits(double tarif_Par_Nuits) {
        this.tarif_Par_Nuits = tarif_Par_Nuits;
    }
}
