public class ZadanieDomowe1 {
    public static void main(String[] args) {
        int jeden = 1217;
        int dwa = 32;
        int trzy = 123;
        int cztery = 3;

        int sumaJedenDwa = jeden + dwa;

        if (sumaJedenDwa % 2 == 0) {
  /*          System.out.println("Suma jest parzysta");
        }else{
            System.out.println("Suma jest nieparzysta");
    */
        }

        int sumaTrzyCztery = trzy + cztery;
  /*      if (sumaTrzyCztery % 2 == 0) {
            System.out.println("Suma jest parzysta");
        }else{
            System.out.println("Suma jest nieparzysta");
        }
*/
        if (sumaJedenDwa % 2 == 0 && sumaTrzyCztery % 2 == 0) {
            System.out.println("Suma jest parzysta");
        } else {
            System.out.println("Suma jest nieparzysta");
        }
    }
}
