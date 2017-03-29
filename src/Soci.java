
public class Soci {

    private int idSoci;
    private String nom;
    private String dataAlta;

    public Soci(int idSoci, String nom, String dataAlta) {
        this.idSoci = idSoci;
        this.nom = nom;
        this.dataAlta = dataAlta;
    }

    public int getIdSoci() {
        return idSoci;
    }

    public void setIdSoci(int idSoci) {
        this.idSoci = idSoci;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }
}
