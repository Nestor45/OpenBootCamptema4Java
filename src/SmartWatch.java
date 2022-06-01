public class SmartWatch extends SmartDevice{
    String tipoSensor;

    public SmartWatch (String color, String marca, String modelo, String anio, String capacidad, String tipoPantalla, String tipoSensor) {
        super(color, marca, modelo, anio, capacidad, tipoPantalla);
        this.tipoSensor = tipoSensor;
    }
}
