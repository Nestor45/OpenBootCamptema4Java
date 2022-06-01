public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SmartDevice device = new SmartDevice("rojo","xiaomi","poco","1996", "126 Gb", "Glass");
        System.out.println("El color del dispositico es: "+device.color);
        System.out.println("La marca del dispositico es: "+device.marca);
        System.out.println("El modelo del dispositico es: "+device.modelo);
        System.out.println("---------------------------------------");
        SmartPhone phone = new SmartPhone("Negro", "Samsung", "A7", "2016", "64 Gb", "Golilaz", "16 Mpx");

        SmartWatch watch = new SmartWatch("Blanco", "Huawai", "G7", "2022", "8 Gb", "Glass", "UltraRx");

        System.out.println("El color del dispositico es: "+phone.color);
        System.out.println("La marca del dispositico es: "+phone.marca);
        System.out.println("El modelo del dispositico es: "+phone.modelo);
        System.out.println("El año del dispositico es: "+phone.anio);
        System.out.println("La capacidad del dispositico es: "+phone.capacidad);
        System.out.println("El tipo de pantalla del dispositico es: "+phone.tipoPantalla);
        System.out.println("El tipo de camara del dispositico es: "+phone.tipoCamara);

        System.out.println("---------------------------------------");

        System.out.println("El color del dispositico es: "+watch.color);
        System.out.println("La marca del dispositico es: "+watch.marca);
        System.out.println("El modelo del dispositico es: "+watch.modelo);
        System.out.println("El año del dispositico es: "+watch.anio);
        System.out.println("La capacidad del dispositico es: "+watch.capacidad);
        System.out.println("El tipo de pantalla del dispositico es: "+watch.tipoPantalla);
        System.out.println("El tipo de sensor del dispositico es: "+watch.tipoSensor);
    }
}
