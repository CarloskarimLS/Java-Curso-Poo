public class perro {
    int ID;
    String raza;
    int precio;

    //metodo contructor
    public perro(int ID, String raza, int precio){
        this.ID = ID;
        this.raza = raza;
        this.precio = precio;
    }

    //metodo
    public void correr(){
        System.out.println("perro " +raza +" corriendo!");
    }

    //metodo
    public void datos(){
        System.out.println("id: "+ID);
        System.out.println("raza: "+raza);
        System.out.println("precio: "+precio);
    }

}
