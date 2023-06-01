public class CodigosTension {
    private String codigo;
    private String tension;
    private String tension_CNMC;

    @Override
    public String toString() {
        return "CodigosTension{" +
                "codigo='" + codigo + '\'' +
                ", tension='" + tension + '\'' +
                ", tension_CNMC='" + tension_CNMC + '\'' +
                '}';
    }

    public CodigosTension(String codigo, String tension, String tension_CNMC) {
        this.codigo = codigo;
        this.tension = tension;
        this.tension_CNMC = tension_CNMC;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }

    public String getTension_CNMC() {
        return tension_CNMC;
    }

    public void setTension_CNMC(String tension_CNMC) {
        this.tension_CNMC = tension_CNMC;
    }
}
