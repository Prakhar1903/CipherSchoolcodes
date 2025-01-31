public class q1 {
    public static void main(String[] args) {
        int intVar = 10;
        double doubleVar = 20.5;
        char charVar = 'A';
        boolean boolVar = true;
        
        System.out.println("Initial Values:");
        System.out.println("intVar: " + intVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("boolVar: " + boolVar);
        
        double intToDouble = intVar; 
        int charToInt = charVar; 
        
        System.out.println("\nValues After Type Conversion:");
        System.out.println("intToDouble (converted from intVar): " + intToDouble);
        System.out.println("charToInt (converted from charVar): " + charToInt);
    }
}
