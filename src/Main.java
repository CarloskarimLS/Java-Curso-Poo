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

        //-------------------------------------
        System.out.println("--------------------------------");
        persona p1 = new persona(22, "Brenda");
        persona p2 = new persona(15, "Sergio");
        p1.datos();
        p2.datos();

        //-------------------------------------
        System.out.println("--------------------------------");
        leon l1 = new leon();

        //-------------------------------------
        System.out.println("--------------------------------");
        arroz arroz_nuevo = new arroz();
        arroz_nuevo.setMarca("Isadora");
        arroz_nuevo.setPeso(100);
        System.out.println(arroz_nuevo.getPesogr());
        System.out.println(arroz_nuevo.getPesokg());

        //-------------------------------------
        System.out.println("--------------------------------");
        clase_externa obj_externo = new clase_externa();
        clase_externa.clase_interna obj_interno = obj_externo.new clase_interna();
        System.out.println(obj_interno.obj_interno_metodo());

        //-------------------------------------
        System.out.println("--------------------------------");
        ciudad paris = new ciudad();
        paris.informacion();

        //-------------------------------------
        System.out.println("--------------------------------");
        fruta nueva_fruta = new fruta();
        fruta manzana = new manzana();
        fruta platano = new platano();
        nueva_fruta.color_fruta();
        manzana.color_fruta();
        platano.color_fruta();

        //-------------------------------------
        System.out.println("--------------------------------");
        club barcelona_fc = new club();
        barcelona_fc.ciudad();
        barcelona_fc.pais_origen();
    }


}