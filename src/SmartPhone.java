public class SmartPhone extends SmartDevice{
    String tipoCamara;

    public SmartPhone (String color, String marca, String modelo, String anio, String capacidad, String tipoPantalla, String tipoCamara) {
        super(color, marca, modelo, anio, capacidad, tipoPantalla);
        this.tipoCamara = tipoCamara;
    }

}
