class Main {
  public static void main(String[] args) {
  Circulo cir = new Circulo();
  System.out.println(cir);//imprime 0 por ... (video)

  cir.setRadio(5.6f);//primer solucion
  System.out.println(cir);
  
  float var = -8.66f;
  cir.setRadio(var);
  System.out.println(cir);//imprime negativos y no es correcto

  System.out.println("** Composicion **");
  Persona persona_1 = new Persona("Johan","Rodriguez",16,07,2002);
  System.out.println(persona_1);

  System.out.println("** Composicion **");
  Persona persona_2 = new Persona("Rafael","Zavala",8,4,1998);
  System.out.println(persona_2);

  System.out.println("** Extra **");
  Persona persona1 = new Persona("Brian","Rodriguez",3,6,1983);
  Persona persona2 = new Persona("Rodrigo","Castañares",13,8,1997);
  Persona persona3 = new Persona("Victor","Gutierrez",23,11,2002);
  Persona persona4 = new Persona("Leo","Cruz",4,7,2015);
  Coche coche1 = new Coche("Negro","Chevrolet",5,2021,1200);
  System.out.println(coche1);
  System.out.println("chofer = "+persona1);
  System.out.println("copiloto = "+persona2);
  System.out.println("pasajero1 = "+persona3);
  System.out.println("pasajero2 = "+persona4);
  }
}
