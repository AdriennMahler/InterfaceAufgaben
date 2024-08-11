import java.util.Scanner;

public class ZahlRaten {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo! Wahle eine Nummer!");
        int x= scanner.nextInt();

        //x - Konstant -Random Number 1-10 speichern
        //Random rand = new Random();
       // final int x= rand.nextInt(10 - 1 + 1) + 1;
        IntOperation op1= new Multiply(2);
        int result1 = op1.execute(x);
        System.out.println("Wir multiplizieren dein Nummer mit 2:");
        System.out.println(result1);
        IntOperation op2= new Multiply(5);
        Thread.sleep(2000);
        System.out.println("Dann mit 5:");
        int result2 = op2.execute(result1);
        Thread.sleep(2000);
        System.out.println(result2);
        IntOperation op3= new Divide(x);
        int result3 = op3.execute(result2);
        System.out.println("Wir teilen die Ergebnis mit dein Nummer: " + x);
        Thread.sleep(2000);
        System.out.println(result3);
        IntOperation op4= new Subtract(7);
        int result4 = op4.execute(result3);
        System.out.println("Am Ende subtrahieren wir 7 und die Ergebnis sollte 3 sein :)");
        Thread.sleep(2000);
        System.out.println("Ergebnis = "+result4);

        //A8-------------------------------------------------------------------------
        IntOperation[] ops={
                new Add(5),
                new ChangeSign(),
                new Multiply(2),
                new Subtract(3)
        };
        x=2;
        for(IntOperation op: ops){
            x=op.execute(x);
        }
        System.out.println("A8 Aufgabe Ergebnis: " +x);
    }

}

    interface IntOperation{
        int execute(int x);
    }

    class Multiply implements IntOperation {
        int y;
        Multiply(int y) {
            this.y = y;
    }

    public int execute(int x) {
        return y * x;
        }
    }
    class Divide implements IntOperation {
        int y;
        Divide(int y) {
            this.y = y;
    }
        public int execute(int x) {
            return x / y;
    }
}
    class Subtract implements IntOperation{
        int z;
        Subtract(int z){
            this.z=z;
        }
        public int execute(int x){
            return x-z;
      }
 }
    class ChangeSign implements IntOperation{
        public int execute(int c){
            return c*-1;
    }
}
    class Add implements IntOperation{
        int d;
        Add(int d){
            this.d=d;
    }
        public int execute(int x){
            return d+x;
    }
}

