
public class Soci {

    private int idSoci;
    private String nom;
    private String dataAlta;
    private String dni;

    public Soci(int idSoci, String nom, String dataAlta, String dni) {
        this.idSoci = idSoci;
        this.nom = nom;
        this.dataAlta = dataAlta;
        this.dni = dni;
    }

    public int getIdSoci() {
        return idSoci;
    }
    public String getNom() {
        return nom;
    }
    public String getDataAlta() {
        return dataAlta;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setIdSoci(int idSoci) {
        this.idSoci = idSoci;
    }



}
