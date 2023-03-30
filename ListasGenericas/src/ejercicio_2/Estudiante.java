package ejercicio_2;
public class Estudiante {
    private String nombre;
    private int edad;
    private int matricula;
    
    public Estudiante(String nombre, int edad, int matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String tusDatos() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", matricula=" + matricula + '}';
    }
    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", matricula=" + matricula + '}';
    }
    
    
}
