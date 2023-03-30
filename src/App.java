public class App {
    public static void main(String[] args) throws Exception {
        
        String name = "Victor GABRIEL de Araujo Costa  ";

        // converter toda a String para minusculas
        String nameLowerCase = name.toLowerCase();
        
        // converter toda a String para maiusculas
        String nameUpperCase = name.toUpperCase();

        // tirar os espaços da frente e de tras
        String nameNoSpaces = name.trim();

        // Recortar a primeira palavra
        String nameNoFirstWord = cutFirstName(nameNoSpaces).trim();

        // Recortar somente os meus dois primeiros nomes
        String lastNames = cutFirstName(nameNoFirstWord).trim().toLowerCase();

        // Nome sem Sobrenomes
        String nameWithoutLastNames = nameNoSpaces.substring(0, 14);

        // Toda vez que tiver 'a' trocar por 'x'
        String nameWithoutCharA = nameNoSpaces.toLowerCase().replace('a', 'x');

        // Trocar o sobrenome costa por aquino
        String nameWithAnotherLastName = nameNoSpaces.toLowerCase().replace("costa", "aquino");

        String[] nameArray = nameNoSpaces.split(" ");

        for(int index = 0; index < nameArray.length; index++) {
            System.out.println(nameArray[index]);
        }
        


    }

    public static String cutFirstName(String name) {
        int indexOfCut = name.indexOf(" ");
        String nameNoFirstName = name.substring(indexOfCut);
        return nameNoFirstName;
    }
}
