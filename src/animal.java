public abstract class animal {
    String nombre;

     animal(String name) {
        this.nombre = name;
    }
    abstract void hacerRuido();

     void printName(){
         System.out.println("animal: "+nombre);
     }

}
