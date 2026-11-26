public class Program {
    public static void main(String[] args) {
        for (int aux3=1; aux3<=3; aux3++) {
            for (int aux2=1; aux2<=5; aux2++) {
                for (int aux=1; aux<=aux2; aux++)
                    System.out.print("* ");
                System.out.println();
            }
            for (int aux2=5; aux2>=1; aux2--) {
                for (int aux=1; aux<=aux2; aux++)
                    System.out.print("* ");
                System.out.println();
            }
        }
    }
}
