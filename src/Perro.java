 class Perro extends animal implements mascota{

     Perro(String name) {
         super(name);
     }

     @Override
     public void saltar() {
         System.out.println("el perro salta");
     }

     @Override
     public void correr() {
         System.out.println("el perro corre");
     }

     @Override
     void hacerRuido() {
         System.out.println("el perro ladra");
     }
 }
