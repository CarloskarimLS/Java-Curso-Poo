public class alumna {
    private String nombre;
    private int edad;
    //constructor
    public alumna(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;

    }
    //metodo
    public void respuesta(){
        System.out.println(this.nombre + " edad: " + this.edad);
    }

    public static alumna mayor(alumna alum1, alumna alum2   ){
        if(alum1.edad >= alum2.edad){
            return alum1;
        }else{
            return alum2;
        }
    }



}
