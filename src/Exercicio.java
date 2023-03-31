

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

        //C) 
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
        String[] sentenceArray = sentence.split("");

        for(int index = 0; index < sentenceArray.length; index++) {
            String letter = sentenceArray[index];
            boolean isDigit = letter.matches("\\d");
            if(isDigit) quantityOfDigits++;
        }

        return quantityOfDigits;
    }

    public static int calculateQuantityVowelsInSetence(String sentence) {
        int quantityOfVowels =  0;
        String[] sentenceArray = sentence.split("");

        for(int index = 0; index < sentenceArray.length; index++) {
            String letter = sentenceArray[index];
            boolean isVowel= letter.matches("[a|e|i|o|u]");
            if(isVowel) quantityOfVowels++;
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
