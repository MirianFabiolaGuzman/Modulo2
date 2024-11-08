//Mirian Fabiola Guzman Moreno
//202410050105
// Programa principal
public class Main 
{
    public static void main(String[] args) 
    {
        Recursos recursos = new Recursos();

        // Llamar al primer método
        System.out.println(recursos.obtenerMensaje());

        // Llamar al segundo método con una edad de ejemplo
        int edadEstudiante = 20; // Cambia este valor para probar
        System.out.println(recursos.verificarEdad(edadEstudiante));

        // Llamar al tercer método
        int resultadoMultiplicacion = recursos.multiplicar(5, 3); // Cambia los valores para probar
        System.out.println("Resultado de la multiplicacion: " + resultadoMultiplicacion);

        // Llamar al cuarto método
        int numeroLimite = 10; // Cambia este valor para probar
        System.out.println("Numeros del 1 al " + numeroLimite + ": " + recursos.listarNumeros(numeroLimite));
    }
}