public class Automovil {
    private String marca;
    private String modelo;
    private String color = "Verde";
    private int cilindraje;

    // Constructores

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    // Metodos Set y Get

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

// Metodos propios y de calculo

    public String verDetalle (){
        String dv = "La marca es ->" + this.marca +"\n" +
        "El modelo es ->" + getModelo() + "\n"+
        "El color es ->" + this.color +"\n"+
        "El cilindraje es ->" +getCilindraje();
        return dv;
    }




    // Modificacion de metodos nativos




}
