package enums;

interface Regione {
   String getNome();
}

class EmiliaRomagna implements Regione {
   String getNome() {
      return "Emilia Romagna";
   }
}
class Lombardia implements Lombardia {
   String getNome() {
      return "Lombardia";
   }
}

class Persona {
   private String nome;
   private String cognome;
   private Regione regione;
   ...	
}

class UsePersona {
   public static void main(String[] args){
      ArrayList<Persona> list = new ArrayList<>();
      list.add(new Persona("Mario","Rossi",new ElimiaRomagna());
      list.add(new Persona("Gino","Bianchi",new Lombardia());
      ...
   }
}
