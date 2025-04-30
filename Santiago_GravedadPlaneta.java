public class Santiago_GravedadPlaneta {
    private int id;
    private String nombre;
    private double GravedadPlaneta;

    public Santiago_GravedadPlaneta(int id, String nombre, double GravedadPlaneta) {
        this.GravedadPlaneta = GravedadPlaneta;
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGravedadPlaneta() {
        return GravedadPlaneta;
    }

    public void setGravedadPlaneta(double GravedadPlaneta) {
        this.GravedadPlaneta = GravedadPlaneta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Santiago_GravedadPlaneta{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", GravedadPlaneta=").append(GravedadPlaneta);
        sb.append('}');
        return sb.toString();
    }

    

}
