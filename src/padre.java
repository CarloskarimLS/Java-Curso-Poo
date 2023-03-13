//HERENCIA
//Superclase
class padre {
    protected String nombre = "Cesar";

    public void saludo(){
        System.out.println("Buenos dias familia.....");
    }
}

//Subclase
class hijo extends padre{
    //Los atributos deben de ser privados cuando son en subclases
    private String nombre_hijo = "Carlos";

    public static void main(String[] args) {
        hijo nuevo_hijo = new hijo();
        nuevo_hijo.saludo();
        System.out.println("tu hijo: "+nuevo_hijo.nombre_hijo );
        System.out.println("tu padre: "+nuevo_hijo.nombre);
    }
}