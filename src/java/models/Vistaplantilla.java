package models;

public class Vistaplantilla implements java.io.Serializable {

    private VistaplantillaId id;

    public Vistaplantilla() {
    }

    public Vistaplantilla(VistaplantillaId id) {
        this.id = id;
    }

    public VistaplantillaId getId() {
        return this.id;
    }

    public void setId(VistaplantillaId id) {
        this.id = id;
    }

}
