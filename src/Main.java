public class Main {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();

        persona.setNombre("Santiago");
        // linea 7 no es necesaria, es solo para mostrar la forma compleja
        String nombre = persona.getNombre();

        System.out.println("Mi nombre es"+" "+persona.getNombre());
        // l 12 =
        persona.setEdad(27);   
        int edad = persona.getEdad();
        System.out.println("tengo"+" "+persona.getEdad()+" "+"años");
        // l 16 =
        persona.setTelefono(358441481);
        int telefono = persona.getTelefono();
        System.out.println("Mi numero de telefono es:"+persona.getTelefono());
    } 
}
class Persona {
        private String nombre;
        private int edad;
        private int telefono;

        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){ 
            return nombre; 
        }

        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
        public int getTelefono(){
            return this.telefono;
        }
}

