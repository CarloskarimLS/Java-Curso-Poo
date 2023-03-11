public class alumno {
    //atributos
    public String nombre = "Carlos";
    // edad solo podra ser accedido desde esta misma clase
    private int edad = 12;

    public static void main(String[] args) {
        alumno alumno_nuevo = new alumno();
        System.out.println("edad: "+ alumno_nuevo.edad);
    }
}
