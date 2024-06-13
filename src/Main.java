
public class Main {
    public static void main(String[] args) {
        //Definimos la variable
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        //tipo String
        String miVariableCadena = "saludos";
        System.out.println(miVariableCadena);
        miVariableCadena = "adios";
        System.out.println(miVariableCadena);

        // var - inferencia de tipos en java
        var miVariable2 = 15;
        System.out.println(miVariable2);
        var miVariableCadena2 = "Salludos";
        System.out.println(miVariableCadena2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        //valores permitidos en el nombre de la variable
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        System.out.println("miVariable = " + miVariable);
        System.out.println("_miVariable = " + _miVariable);
        System.out.println("$miVariable = " + $miVariable);

    }
}