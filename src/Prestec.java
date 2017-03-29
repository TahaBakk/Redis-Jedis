
public class Prestec {

    private int idPrestec;
    private int idLlibre;
    private int idSoci;
    private String dataPrestec;
    private String dataRetorn;

    public Prestec(int idPrestec, int idLlibre, int idSoci, String dataPrestec, String dataRetorn) {
        this.idPrestec = idPrestec;
        this.idLlibre = idLlibre;
        this.idSoci = idSoci;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataRetorn;
    }

    public int getIdPrestec() {
        return idPrestec;
    }

    public void setIdPrestec(int idPrestec) {
        this.idPrestec = idPrestec;
    }

    public int getIdLlibre() {
        return idLlibre;
    }

    public void setIdLlibre(int idLlibre) {
        this.idLlibre = idLlibre;
    }

    public int getIdSoci() {
        return idSoci;
    }

    public void setIdSoci(int idSoci) {
        this.idSoci = idSoci;
    }

    public String getDataPrestec() {
        return dataPrestec;
    }

    public void setDataPrestec(String dataPrestec) {
        this.dataPrestec = dataPrestec;
    }

    public String getDataRetorn() {
        return dataRetorn;
    }

    public void setDataRetorn(String dataRetorn) {
        this.dataRetorn = dataRetorn;
    }
}
