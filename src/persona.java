public class persona {
    //atributos
    int edad;
    String nombre;

    //constructor
    public persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;

    }

    //metodo para visualizar resultados
    public void datos(){
        System.out.println("edad: "+edad+" nombre: "+nombre);
    }
}
