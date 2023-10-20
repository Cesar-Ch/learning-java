package Day01datatypes;

public class Main {
    public static void main(String[] args) {
        String name = "Jhon"; // almacena texto. Los valores de cadena están entre comillas dobles
        System.out.println(name);

        byte myByte = 127; // almacena nÚmeros enteros de 8 bits mayores a -128 y menores a 127
        //2 - 4 - 8 - 16 - 32 - 64 - 128 - 256 
        System.out.println(myByte);

        short myShort = 32767; // almacena nÚmeros enteros de 16 bits mayores a -32768 y menores a 32767
        System.out.println(myShort);

        int myNum = 2147483647; // almacena números enteros de 32 bits mayores a -2,147,483,648 y menores
                                // 2,147,483,647
        System.out.println(myNum);

        long myLongNum = 9223372036854775807L; // almacena nÚmeros enteros de 64 bits mayores a
                                               // -9,223,372,036,854,775,808 y menores a 9223372036854775807
        System.out.println(myLongNum);

        float myFloatNum = 5.999f; // almacena nÚmeros de 32 bytes.Almacena números fraccionarios. Suficiente para
                                   // almacenar de 6 a 7 dígitos decimales
        System.out.println(myFloatNum);

        double myDouble = 9.999d; // almacena nÚmeros de 64 bytes. Almacena nÚmeros fraccionarios. Suficiente para
                                  // 15 decimales
        System.out.println(myDouble);

        char myLetter = 'D'; // almacena un carácter - 16 bits
        System.out.println(myLetter);
        char mychar = '\u0050';
        System.out.println(mychar);

        boolean myBool = true; // almacena valores logicos - 1 bit
        System.out.println(myBool);

    }
}
