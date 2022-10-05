package introductiontoJava;

import java.util.Scanner;

public class num_to_text {
    public static void main(String[] args) {
        String textTram, textChuc, textDonvi;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 20) {
            if (number / 100 > 0) {
                int hangTram = (number / 100);
                int checkhangChuc = (number - hangTram * 100);
                switch (hangTram) {
                    case 1:
                        textTram = "One hundred and";
                        break;
                    case 2:
                        textTram = "Two hundred and";
                        break;
                    case 3:
                        textTram = "Three hundred and";
                        break;
                    case 4:
                        textTram = "Four hundred and";
                        break;
                    case 5:
                        textTram = "Five hundred and";
                        break;
                    case 6:
                        textTram = "Six hundred and";
                        break;
                    case 7:
                        textTram = "Seven hundred and";
                        break;
                    case 8:
                        textTram = "Eight hundred and";
                        break;
                    case 9:
                        textTram = "Nine hundred and";
                        break;
                    default:
                        textTram="";
                }
                if (checkhangChuc >= 20) {
                    int hangChuc = checkhangChuc / 10;
                    int hangDonvi = (number - hangTram * 100 - hangChuc * 10);
                    switch (hangChuc) {
                        case 2:
                            textChuc = "Twenty";
                            break;
                        case 3:
                            textChuc = "Thirty";
                            break;
                        case 4:
                            textChuc = "Forty";
                            break;
                        case 5:
                            textChuc = "Fifty";
                            break;
                        case 6:
                            textChuc = "Sixty";
                            break;
                        case 7:
                            textChuc = "Seventy";
                            break;
                        case 8:
                            textChuc = "Eighty";
                            break;
                        case 9:
                            textChuc = "Ninety";
                            break;
                        default:
                            textChuc="";
                    }
                    switch (hangDonvi) {
                        case 1:
                            textDonvi = "One";
                            break;
                        case 2:
                            textDonvi = "Two";
                            break;
                        case 3:
                            textDonvi = "Three";
                            break;
                        case 4:
                            textDonvi = "Four";
                            break;
                        case 5:
                            textDonvi = "Five";
                            break;
                        case 6:
                            textDonvi = "Six";
                            break;
                        case 7:
                            textDonvi = "Seven";
                            break;
                        case 8:
                            textDonvi = "Eight";
                            break;
                        case 9:
                            textDonvi = "Nine";
                            break;
                        default:
                            textDonvi="";
                    }
                } else {
                    textChuc="";
                    if (checkhangChuc > 10) {
                        switch (checkhangChuc) {
                            case 1:
                                textDonvi = "Eleven";
                                break;
                            case 2:
                                textDonvi = "Twelve";
                                break;
                            case 3:
                                textDonvi = "Thirteen";
                                break;
                            case 4:
                                textDonvi = "Fourteen";
                                break;
                            case 5:
                                textDonvi = "Fifteen";
                                break;
                            case 6:
                                textDonvi = "Sixteen";
                                break;
                            case 7:
                                textDonvi = "Seventeen";
                                break;
                            case 8:
                                textDonvi = "Eighteen";
                                break;
                            case 9:
                                textDonvi = "Nineteen";
                                break;
                            default:
                                textDonvi="";
                        }
                    } else {
                        switch (checkhangChuc) {
                            case 1:
                                textDonvi = "One";
                                break;
                            case 2:
                                textDonvi = "Two";
                                break;
                            case 3:
                                textDonvi = "Three";
                                break;
                            case 4:
                                textDonvi = "Four";
                                break;
                            case 5:
                                textDonvi = "Five";
                                break;
                            case 6:
                                textDonvi = "Six";
                                break;
                            case 7:
                                textDonvi = "Seven";
                                break;
                            case 8:
                                textDonvi = "Eight";
                                break;
                            case 9:
                                textDonvi = "Nine";
                                break;
                            default:
                                textDonvi="";
                        }
                    }
                }
                System.out.println(textTram + textChuc + textDonvi);
            } else {
                if (number > 10) {
                    switch (number) {
                        case 1:
                            textDonvi = "Eleven";
                            break;
                        case 2:
                            textDonvi = "Twelve";
                            break;
                        case 3:
                            textDonvi = "Thirteen";
                            break;
                        case 4:
                            textDonvi = "Fourteen";
                            break;
                        case 5:
                            textDonvi = "Fifteen";
                            break;
                        case 6:
                            textDonvi = "Sixteen";
                            break;
                        case 7:
                            textDonvi = "Seventeen";
                            break;
                        case 8:
                            textDonvi = "Eighteen";
                            break;
                        case 9:
                            textDonvi = "Nineteen";
                            break;
                        default:
                            textDonvi="";
                    }
                } else {
                    switch (number) {
                        case 1:
                            textDonvi = "One";
                            break;
                        case 2:
                            textDonvi = "Two";
                            break;
                        case 3:
                            textDonvi = "Three";
                            break;
                        case 4:
                            textDonvi = "Four";
                            break;
                        case 5:
                            textDonvi = "Five";
                            break;
                        case 6:
                            textDonvi = "Six";
                            break;
                        case 7:
                            textDonvi = "Seven";
                            break;
                        case 8:
                            textDonvi = "Eight";
                            break;
                        case 9:
                            textDonvi = "Nine";
                            break;
                        default:
                            textDonvi="";
                    }
                }
            }
            System.out.println(textDonvi);
        }
    }
}
