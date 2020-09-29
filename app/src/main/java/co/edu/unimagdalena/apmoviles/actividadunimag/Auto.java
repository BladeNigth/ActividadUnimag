package co.edu.unimagdalena.apmoviles.actividadunimag;

public class Auto {

    public  String modelo;
    public String marca;
    public String placa;

    public Auto (String modelo,String marca, String placa){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                '}';
    }
}
