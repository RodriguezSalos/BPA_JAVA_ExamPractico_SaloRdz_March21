package ExamenPractica_SaloRdz;



public class Persona {
    private String nombre;
    private String apellido;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public Persona (String nombre){
       this.nombre = nombre; 
    }
 
    public void imprimirNombre(){
        System.out.println( nombre +" "+ apellido);
    }


 


  

}
