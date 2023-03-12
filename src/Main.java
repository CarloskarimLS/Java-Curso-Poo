import javax.swing.plaf.basic.BasicComboBoxRenderer;

public class  Main {
    public static void main(String[] args) {
        perro perro_uno = new perro(1, "chiwawa", 2000);
        perro_uno.datos();
        perro_uno.correr();
        System.out.println(".............................");
        perro perro_dos = new perro(2, "pastor australiano", 1999);
        perro_dos.datos();
        perro_dos.correr();

        //-----------------------------------------
        System.out.println("--------------------------------");
        alumno alumno_nuevo = new alumno();
        System.out.println("nombre: "+ alumno_nuevo.nombre);

        //-------------------------------------
        System.out.println("--------------------------------");
        alumna alumna1 = new alumna("Brenda", 22);
        alumna alumna2 = new alumna("Karim", 23);
        alumna1.respuesta();
        alumna2.respuesta();

        alumna edad_mayor = alumna.mayor(alumna1,alumna2);
        System.out.println("Alumno con mayor edad: ");
        edad_mayor.respuesta();


        //-------------------------------------
        System.out.println("--------------------------------");
        fecha f = new fecha();
        f.setDia(6);
        f.setMes("Julio");
        f.setAnio(2018);
        System.out.println("dia: "+ f.getDia() + " mes: " +f.getMes()+ " anio: "+ f.getAnio());


    }


}