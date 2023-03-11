public class moto {
    //atributos
    int modelo;
    String marca;
    //creacion de un constructor
    // el constructor debe tener el nombre de la clase
    public moto(int anio, String nombre){
        modelo = anio;
        marca = nombre;
    }

    public static void main(String[] args) {
        moto mi_moto = new moto(2016, "ram");
        System.out.println("datos de mi moto: " + mi_moto.modelo+ " " + mi_moto.marca);
    }

}
