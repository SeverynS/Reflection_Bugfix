package bugs;

/**
 * Посчитать сумму чисел в строке
 * например "123"=1+2+3=6
 * например "1234"=1+2+3+4=10
 * например "5234"=5+2+3+4=14
 * <p>
 * баг в том что программа считает некорректно; необходимо пофиксить и объяснить
 */
public class Bug6 {
    public static void main(String[] args) {
        String numberAsString = "5234";
        int sum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            // Если складывать char-ы получается десятичное значение ascii + ...
            // А еще в цикле индекс 0 был, соответственно, в данном примере мы получим 20(5+5+5+5)
            int strElement = Character.getNumericValue(numberAsString.charAt(i));
            sum += strElement;
        }

        System.out.println("Sum = " + sum);
    }
}