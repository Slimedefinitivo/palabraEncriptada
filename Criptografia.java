public class Criptografia {

    public String encriptacion(String pSecreta) {

        pSecreta = pSecreta.replace("b", "�");
        pSecreta = pSecreta.replace("c", "|");
        pSecreta = pSecreta.replace("d", "!");
        pSecreta = pSecreta.replace("f", "#");
        pSecreta = pSecreta.replace("g", "$");
        pSecreta = pSecreta.replace("h", "%");
        pSecreta = pSecreta.replace("j", "&");
        pSecreta = pSecreta.replace("k", "/");
        pSecreta = pSecreta.replace("l", "(");
        pSecreta = pSecreta.replace("m", ")");
        pSecreta = pSecreta.replace("n", "=");
        pSecreta = pSecreta.replace("p", "?");
        pSecreta = pSecreta.replace("q", "�");
        pSecreta = pSecreta.replace("r", "{");
        pSecreta = pSecreta.replace("s", "}");
        pSecreta = pSecreta.replace("t", "[");
        pSecreta = pSecreta.replace("w", "]");
        pSecreta = pSecreta.replace("x", "*");
        pSecreta = pSecreta.replace("y", "�");
        pSecreta = pSecreta.replace("z", "-");

        pSecreta = pSecreta.replace("B", "1");
        pSecreta = pSecreta.replace("C", "2");
        pSecreta = pSecreta.replace("D", "3");
        pSecreta = pSecreta.replace("F", "4");
        pSecreta = pSecreta.replace("G", "5");
        pSecreta = pSecreta.replace("H", "6");
        pSecreta = pSecreta.replace("J", "7");
        pSecreta = pSecreta.replace("K", "8");
        pSecreta = pSecreta.replace("L", "9");
        pSecreta = pSecreta.replace("M", "�");
        pSecreta = pSecreta.replace("N", "�");
        pSecreta = pSecreta.replace("P", "�");
        pSecreta = pSecreta.replace("Q", "?");
        pSecreta = pSecreta.replace("R", "�");
        pSecreta = pSecreta.replace("S", "�");
        pSecreta = pSecreta.replace("T", "�");
        pSecreta = pSecreta.replace("W", "�");
        pSecreta = pSecreta.replace("X", "�");
        pSecreta = pSecreta.replace("Y", "?");
        pSecreta = pSecreta.replace("Z", "�");

        pSecreta = pSecreta.replace("e", ".");
        pSecreta = pSecreta.replace("i", "�");
        pSecreta = pSecreta.replace("o", "�");
        pSecreta = pSecreta.replace("U", ";");
        pSecreta = pSecreta.replace("A", ":");
        pSecreta = pSecreta.replace("E", "'");
        pSecreta = pSecreta.replace("I", "_");
        pSecreta = pSecreta.replace("O", "@");
        pSecreta = pSecreta.replace("U", "?");

        String originalString = pSecreta;

        int contador = 0;

        for (int i = 0; i < pSecreta.length(); i++) {

            char c = pSecreta.charAt(i);

            if ((c == 'a')) {

                contador++;

                String front = pSecreta.substring(0, i);
                String back = pSecreta.substring(i + 1);
                pSecreta = front + "+" + back;

            }

        }
        return "Palabra cifrada al extremo: " + pSecreta;
    }


    public String desEncriptacion(String secreta) {

        secreta = secreta.replace("�", "b");
        secreta = secreta.replace("|", "c");
        secreta = secreta.replace("!", "d");
        secreta = secreta.replace("#", "f");
        secreta = secreta.replace("$", "g");
        secreta = secreta.replace("%", "h");
        secreta = secreta.replace("&", "j");
        secreta = secreta.replace("/", "k");
        secreta = secreta.replace("(", "l");
        secreta = secreta.replace(")", "m");
        secreta = secreta.replace("=", "n");
        secreta = secreta.replace("?", "p");
        secreta = secreta.replace("�", "q");
        secreta = secreta.replace("{", "r");
        secreta = secreta.replace("}", "s");
        secreta = secreta.replace("[", "t");
        secreta = secreta.replace("]", "w");
        secreta = secreta.replace("*", "x");
        secreta = secreta.replace("�", "y");
        secreta = secreta.replace("-", "z");

        secreta = secreta.replace("1", "B");
        secreta = secreta.replace("2", "C");
        secreta = secreta.replace("3", "D");
        secreta = secreta.replace("4", "F");
        secreta = secreta.replace("5", "G");
        secreta = secreta.replace("6", "H");
        secreta = secreta.replace("7", "J");
        secreta = secreta.replace("8", "K");
        secreta = secreta.replace("9", "L");
        secreta = secreta.replace("�", "M");
        secreta = secreta.replace("�", "N");
        secreta = secreta.replace("�", "P");
        secreta = secreta.replace("?", "Q");
        secreta = secreta.replace("�", "R");
        secreta = secreta.replace("�", "S");
        secreta = secreta.replace("�", "T");
        secreta = secreta.replace("�", "W");
        secreta = secreta.replace("�", "X");
        secreta = secreta.replace("?", "Y");
        secreta = secreta.replace("�", "Z");

        secreta = secreta.replace("+", "a");
        secreta = secreta.replace(".", "e");
        secreta = secreta.replace("�", "i");
        secreta = secreta.replace("�", "o");
        secreta = secreta.replace(";", "u");
        secreta = secreta.replace(":", "A");
        secreta = secreta.replace("'", "E");
        secreta = secreta.replace("_", "I");
        secreta = secreta.replace("@", "O");
        secreta = secreta.replace("?", "U");

        String originalString = secreta;

        for (int i = 0; i < secreta.length(); i++) {

            char c = secreta.charAt(i);

            String front = secreta.substring(0, i);
            String back = secreta.substring(i + 1);
        }

        return "Palabra descrifrada: " + secreta;

    }

}
