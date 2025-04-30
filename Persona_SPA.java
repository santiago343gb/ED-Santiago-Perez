public class Persona_SPA {
private int id;
private int nombre;
private double masa;
private double altura;
private int edad;
//costrutor inicial
public Persona_SPA(int id, String papa, int nombre, double masa, int edad) {
    this.id = id;
    this.nombre = nombre;
    this.masa = masa;
    this.altura = altura;
    this.edad = edad;
}
//getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }
// kijhohiouh
    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//ToString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Santiago{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", masa=").append(masa);
        sb.append(", altura=").append(altura);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }



}

