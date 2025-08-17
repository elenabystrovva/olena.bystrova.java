//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello Java!");
        getGeneralDataTypesInformation();
        getInfoLocalData();
        getBasicVariableInformation();

    }

    public static void getGeneralDataTypesInformation(){

        System.out.println(10/5);
        System.out.println(29-30);
        System.out.println(8*8);
        System.out.println(11%5);
        System.out.println(10%5);
        int year = 366;
        int months = 12;
        System.out.println(year/months);
        System.out.println(10%5);

        // Автоматическое расширение ТИПА
        byte byteVal = -128;
        int valInt = byteVal;
        System.out.println(valInt);
        double bigDouble = 0; // 8 bytes
        int bigInt = 2000000000; // 4 bytes

        char letter = 'R'; // char под капотом целое
        int charValue = letter; // Возьмет значение целочисленное из таблицы и присвоит
        System.out.println(charValue);
        charValue = 100;
        letter = (char) charValue;
        System.out.println(letter);

        long myLong = -2_000_000_000_988_888L;
        int longCasted = (int) myLong; // ПЕРЕПОЛНЕНИЕ INT
        System.out.println(longCasted);
    }

    public static void getInfoLocalData(){
        // Примитив не из-за СТЭКА, а из-за того, что под переменной адрес, который прямо указывает на его значение
        int myValue = 100;
        myValue = 9;
        System.out.println(myValue);
    }

    public static void getBasicVariableInformation(){

        byte myByte = 34;
        short myShort = -31_345;
        long myLong = -3_000_000_000_000_123L;
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println("My byte value is: " + myByte + ". And my long value is: " + myLong);

        float myFloat = -4.3578458F;
        double myDouble = 15.3938489944;
        System.out.println("My float: " + myFloat);
        System.out.println("My double: " + myDouble);

        char letter = '+';
        System.out.println("My letter is: " + letter);
        letter = 33;
        System.out.println("My letter is: " + letter);

        String name = "Elena";
        String surname = "Bystrova";
        String fullNameConcatenated = name + " " + surname;
        System.out.println(fullNameConcatenated);

        boolean isEmployed = true;
        System.out.println("Are you employer: " + isEmployed);
        System.out.println("Welcome to Java " + fullNameConcatenated);
    }
}