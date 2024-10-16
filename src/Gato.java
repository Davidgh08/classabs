 class Gato extends animal implements mascota{

     Gato(String name) {
         super(name);
     }

     @Override
     public void saltar() {
         System.out.println("el gato salta");
     }

     @Override
     public void correr() {
         System.out.println("el gato corre");
     }

     @Override
     void hacerRuido() {
         System.out.println("el gato maulla");
     }
 }
