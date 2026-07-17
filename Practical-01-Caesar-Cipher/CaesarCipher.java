class CaesarCipher {

    public static void main(String[] args) {

        String text = "Mahesh Pawar 1229";

        String encrypted = encrypt(text, 3);

        System.out.println("Original Text  : " + text);
        System.out.println("Encrypted Text : " + encrypted);
        System.out.println("Decrypted Text : " + decrypt(encrypted, 3));
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, 26 - (key % 26));
    }

    public static String encrypt(String text, int key) {

        StringBuilder sb = new StringBuilder();

        for (char ch : text.toCharArray()) {

            if (Character.isUpperCase(ch)) {

                char c = (char) ((ch - 'A' + key) % 26 + 'A');
                sb.append(c);

            }
            else if (Character.isLowerCase(ch)) {

                char c = (char) ((ch - 'a' + key) % 26 + 'a');
                sb.append(c);

            }
            else {

                sb.append(ch);

            }
        }

        return sb.toString();
    }
}