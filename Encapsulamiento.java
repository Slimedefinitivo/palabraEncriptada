public class Encapsulamiento {

    private String claveAcceso;

    Encapsulamiento() {

    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public Encapsulamiento(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }
}
