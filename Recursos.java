//Miriasn Fabiola Guzman Moreno
//202410050105
//Clase Recursos
public class Recursos 
{

    // Primer método: Hacer que un mensaje retorne  
    public String obtenerMensaje() 
    {
        return "Programacion Orientada a Objetos 2021";
    }

    // Segundo método: Que pueda verificar y arrojar un mensaje de mayor o menos de edad
    public String verificarEdad(int edad)
    {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // Tercer método: Retornar y dar resultados de la multiplicación de dos enteros
    public int multiplicar(int a, int b)
    {
        return a * b;
    }

    // Cuarto método: Hacer que retorne una lista de números del 1 al X
    public String listarNumeros(int x) {
        StringBuilder lista = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            lista.append(i).append(" ");
        }
        return lista.toString().trim();
    }
}