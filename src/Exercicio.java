

public class Exercicio {
    public static void main(String[] args) {
        
        String fpC3V7 = "O que para mim era lucro passei a considerar como prejuízo por causa de Cristo";

        String nameUniversity = "UNIRIO";

        String sentenceWithDigits = "Victor123";

        // 1 Exercicio
        //A)
        int quantityOfCharacteres = fpC3V7.length();

        System.out.println("Quantidade de caracteres: " + quantityOfCharacteres);

        //B)
        String sentenceToUpperCase = fpC3V7.toUpperCase();
        System.out.println("Versiculo em Maiusculo: " + sentenceToUpperCase);

        //C) -> Possivel resolver com regex
        int quantityOfVowels = calculateQuantityVowelsInSetence(fpC3V7.toLowerCase());
        System.out.println("Quantidade de Vogais: " + quantityOfVowels);

        //D)
        boolean startsWithUni = sentenceStartsWithUni(nameUniversity);
        System.out.println("A string começa com UNI: " + startsWithUni);

        //E) 
        boolean endsWithRio = sentenceEndsWithRio(nameUniversity);
        System.out.println("Atring termina com RIO: " + endsWithRio);

        //F) -> Possivel resolver com Regex
        int quantityDigitsInSentence = calculateQuantityDigitsInSentence(sentenceWithDigits);
        System.out.println("Quantidade de digitos na sentença: " + quantityDigitsInSentence);

        // E)
    }

    private static int calculateQuantityDigitsInSentence(String sentence) {
        int quantityOfDigits = 0;

        for(int index = 0; index < sentence.length(); index++) {
            char c = sentence.charAt(index);
            if(c == '0'|| c == '1' || c == '2' || c == '3' ||c == '4')  quantityOfDigits++;
            if(c == '5' || c == '6' || c == '7' || c == '8' || c == '9')  quantityOfDigits++;
        }

        return quantityOfDigits;
    }

    public static int calculateQuantityVowelsInSetence(String sentence) {
        int quantityOfVowels =  0;
        
        for(int index = 0; index < sentence.length(); index++) {
            char c = sentence.charAt(index);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') quantityOfVowels++;
        }

        return quantityOfVowels;
    }

    public static boolean sentenceStartsWithUni(String sentence) {
        String sentenceLowerCase = sentence.toLowerCase();
        return sentenceLowerCase.startsWith("uni", 0);
    }

    private static boolean sentenceEndsWithRio(String sentence) {
        String sentenceToLowerCase = sentence.toLowerCase();
        return sentenceToLowerCase.endsWith("rio");
    }
}
