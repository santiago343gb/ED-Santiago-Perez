public class Main {
     // Santiago
    // version 1.00001
    // calcula el peso en distintos planetas
    // main
    public static void main(String[] args) {
        Persona_SPA pers1 = new Persona_SPA(1, "Papa", 85, 1.75, 22);
        Persona_SPA pers2 = new Persona_SPA(2, "Pepa", 75, 1.80, 25);

        Santiago_GravedadPlaneta plan1 = new Santiago_GravedadPlaneta(1, "Tierra ", 9.81);
        Santiago_GravedadPlaneta plan2 = new Santiago_GravedadPlaneta(2, "Marte", 3.72);
        Santiago_GravedadPlaneta plan3 = new Santiago_GravedadPlaneta(3, "Jupiter", 24.79);

        // Calculo peso tierra peso 
        double masaPersona = pers1.getMasa();
        double gravedadTierra = plan1.getGravedadPlaneta();
        double pesoTierra = masaPersona*gravedadTierra;
        // Calculo peso persona marte
        double masaPersona2 = pers1.getMasa();
        double gravedadMarte = plan1.getGravedadPlaneta();
        double pesoMarte = masaPersona*gravedadMarte;
        // Calculo peso jupiter
        double masaPersona3 = pers1.getMasa();
        double gravedadJupiter = plan1.getGravedadPlaneta();
        double pesoJupiter = masaPersona*gravedadJupiter;

        // imprimir info
        System.out.println(pers1);
        System.out.println("El IMC de la persona"+ pers1.getNombre()+"es ...");
        System.out.println(pers2);
        System.out.println("El IMC de la persona"+ pers2.getNombre()+"es ...");
        System.out.println(plan1);
        System.out.println(plan2);
        System.out.println(plan3);
        System.out.println("peso"+pers1.getNombre()+ "en tierra: "+pesoTierra);
        System.out.println("peso"+pers1.getNombre()+ "en Marte: "+pesoMarte);
        System.out.println("peso"+pers1.getNombre()+ "en Jupiter: "+pesoJupiter);




    }

 
}
