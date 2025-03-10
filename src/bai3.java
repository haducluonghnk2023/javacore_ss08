import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email,password;
        while (true) {
            System.out.println("Nhập email :");
            email = sc.nextLine();
            boolean isValidEmail = true;
            int atSymbolCount = 0;
            boolean validDomain =  false;
            for(int i = 0; i < email.length(); i++) {
                if(email.charAt(i) == '@') {
                    atSymbolCount++;
                }
            }
            if(atSymbolCount != 1) {
                isValidEmail = false;
            }
            if (email.endsWith(".com") || email.endsWith(".vn") || email.endsWith(".org")) {
                validDomain = true;
            }
            if(email.length() > 0){
                if(!Character.isLetterOrDigit(email.charAt(0))) {
                    isValidEmail = false;
                }
                for(int i = 0; i < email.length(); i++) {
                    char currentChar = email.charAt(i);
                    if(!Character.isLetterOrDigit(currentChar) && currentChar != '.' && currentChar != '-'  && currentChar != '_' && currentChar != '@') {
                        isValidEmail = false;
                        break;
                    }
                }
            }else {
                isValidEmail = false;
            }
            if (isValidEmail && validDomain) {
                break;
            } else {
                System.err.println("Email không hợp lệ. Vui lòng nhập lại.");
            }
        }
        while (true) {
            System.out.print("Nhập mật khẩu :");
            password = sc.nextLine();
            if (password.length() < 8){
                System.err.println("Mật khẩu phải chứa ít nhất 8 kí tự");
            }else {
                boolean hasUpperCase = false;
                boolean hasLowerCase = false;
                boolean hasDigit = false;
                boolean hasSpecialCharacter = false;

                String specialCharacters = "@#$%!&*";

                for (char character : password.toCharArray()) {
                    if (Character.isUpperCase(character)) {
                        hasUpperCase = true;
                    } else if (Character.isLowerCase(character)) {
                        hasLowerCase = true;
                    } else if (Character.isDigit(character)) {
                        hasDigit = true;
                    } else if (specialCharacters.indexOf(character) != -1) {
                        hasSpecialCharacter = true;
                    }
                }

                if (hasUpperCase && hasLowerCase && hasDigit && hasSpecialCharacter) {
                    break;
                } else {
                    System.out.println("Mật khẩu không hợp lệ. Phải chứa ít nhất 1 chữ hoa, 1 chữ thường, 1 chữ số và 1 ký tự đặc biệt (@, #, $, %, !, &, *)");
                }
            }
        }
        System.out.println("Email và mật khẩu hợp lệ!");
    }
}
