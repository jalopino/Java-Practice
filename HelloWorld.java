import java.util.Scanner;
import java.util.Arrays;

/*
public class HelloWorld {
    public static void main(String args[]) {
        int a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Input three numbers!");
        System.out.println("A = ");
        a = in.nextInt();
        System.out.println("B = ");
        b = in.nextInt();
        System.out.println("C = ");
        c = in.nextInt();

        if((a > b && a < c) || (a > c && a < b)) {
            System.out.println("The second highest is A");
        } else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println("The second highest is B");
        } else if ((c > a && c < b) || (c > b && c < a)) {
            System.out.println("The second highest is C");
        }
    }
}


public class TotalPurchaseProgram {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int Quantity;
        double TotalPurchase, UnitPrice, Discount;
        String remarks;
        System.out.println("Enter Quantity of Item: ");
        Quantity = in.nextInt();
        System.out.println("Enter Unit Price: ");
        UnitPrice = in.nextDouble();
        System.out.println("Enter Discount: ");
        Discount = in.nextDouble();
        TotalPurchase = ((Quantity * UnitPrice) - Discount);
        if (TotalPurchase > 1000) {
            remarks = "Budget is sufficient for the day";
        } else
            remarks = "Budget is not sufficient for the day";

        System.out.println("Total Purchase: " + TotalPurchase + " " + remarks);
    }
}


public class HelloWorld {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int Participants, Fee = 1000, TotalParticantFee;
        double TotalAmount, Discount, DiscountAmount;
        System.out.println("Number of participants: ");
        Participants = in.nextInt();
        TotalParticantFee = Participants * Fee;
        if (Participants <= 10 && Participants >= 1) {
            Discount = 0.10;
            DiscountAmount = TotalParticantFee * Discount;
            TotalAmount = TotalParticantFee - DiscountAmount;
            System.out.println("Total Amount Payable: " + TotalAmount);
        } else if (Participants < 20 && Participants > 10) {
            Discount = 0.15;
            DiscountAmount = TotalParticantFee * Discount;
            TotalAmount = TotalParticantFee - DiscountAmount;
            System.out.println("Total Amount Payable: " + TotalAmount);
        } else if (Participants >= 20) {
            Discount = 0.20;
            DiscountAmount = TotalParticantFee * Discount;
            TotalAmount = TotalParticantFee - DiscountAmount;
            System.out.println("Total Amount Payable: " + TotalAmount);
        }
    }
}


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class HelloWorld {

    public static void main(String[] argv) throws Exception {
        JTextField textField = new JTextField();
        textField.addKeyListener(new Keychecker());
        JFrame jframe = new JFrame();
        jframe.add(textField);
        jframe.setSize(400, 350);
        jframe.setVisible(true);
    }

    static class Keychecker extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {
            char ch = event.getKeyChar();
            switch(ch) {
                case '1':
                    System.out.println(ch);
                    break;
                case '2':
                    System.out.println(ch);
                    break;
                case '3':
                    System.out.println(ch);
                    break;
                case '4':
                    System.out.println(ch);
                    break;
                case '5':
                    System.out.println(ch);
                    break;
                case '6':
                    System.out.println(ch);
                    break;
                case '7':
                    System.out.println(ch);
                    break;
                case '8':
                    System.out.println(ch);
                    break;
                case '9':
                    System.out.println(ch);
                    break;
                default:
                    System.out.println("Not Allowed");
                    break;
            }
        }

    }
}



public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Put Last Name");
        char MyName[] = in.next().toCharArray();
        System.out.println("Elements = ");
        for(int i = 0; i < MyName.length; i++) {
            System.out.println(MyName[i]);
        }
        System.out.println("Second Array");

        char MyName2[] = new char [MyName.length]; //Create a new array same length and size as MyName

        //Transfer MyName to MyName2
        for(int i = 0; i < MyName.length; i++) {
            MyName2[i] = MyName[i];
        }

        System.out.println("My Name In Reverse: ");
        for(int i = MyName2.length - 1; i >= 0; i--) {
            System.out.println(MyName2[i]);
        }
    }
}



public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char answer;
        System.out.println("a. string mycode = \"CC103\";");
        System.out.println("b. String mycode = \"CC103\";");
        System.out.println("c. String mycode = 'CC103';");
        System.out.println("d. strings mycode \"CC103\"");
        for(int i = 0; i < 3; i++) {
            System.out.println("Enter your choice: ");
            answer = in.next().charAt(0);
            if (answer == 'b') {
                System.out.println("Correct Answer");
                break;
            } else
            System.out.println("Incorrect Answer");
            if (i == 2) {
                System.out.println("You used up all three attempts");
            }
        }
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        String Pattern = "*******";
        char[] PatternChars = Pattern.toCharArray();
        for (int i = 0; i < 7; i++) {
            char convert = (char)((i + 1)+'0');
            PatternChars[i] = convert;
            String NewPattern = new String(PatternChars);
            System.out.println(NewPattern);
        }
    }



public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char answer;
        char restart;
        while (true) {
            System.out.println("What is the command keyword to exit a loop in Java?");
            System.out.println("a. int");
            System.out.println("b. continue");
            System.out.println("c. break");
            System.out.println("d. exit");
            System.out.println("Enter your choice: ");
            answer = in.next().charAt(0);
            if (answer == 'c') {
                System.out.println("Correct!");
            } else
                System.out.println("Incorrect!");
            System.out.println("Again? Enter y to continue:");
            restart = in.next().charAt(0);
            if (restart == 'y') {
                continue;
            } else
                break;
        }
    }
}



public class HelloWorld {
    public static void main(String[] args) {
        int a, b, sum;
        boolean retry = true;
        char reply;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter first digit: ");
            a = in.nextInt();
            System.out.println("Enter second digit: ");
            b = in.nextInt();
            sum = a + b;
            System.out.println("The sum of the two digits are:  " + sum);
            System.out.println("Would you like to try again? y/n: ");
            reply = in.next().charAt(0);
            if (reply == 'y' || reply == 'Y') {
                continue;
            } else if (reply == 'n' || reply == 'N') {
                retry = false;
            } else
                retry = false;
        }
        while (retry != false);
    }
}



public class HelloWorld {
    public static void main(String[] args) {
        int placement;
        String Pattern = "         ";
        char[] PatternChars = Pattern.toCharArray();
        for(int i = 1; i <= 5; i++) {
            char convert = (char)(i +'0');
            PatternChars[4] = convert;
            if (i > 1) {
                for (int x = 1; x < 4; x++) {
                    PatternChars[4 - (i - x)] = convert;
                    PatternChars[4 + (i - x)] = convert;
                    if (i > 4) {
                        PatternChars[4 - x] = convert;
                        PatternChars[4 + x] = convert;
                    }
                }
            }
            String NewPattern = new String(PatternChars);
            System.out.println(NewPattern);
        }
    }
}


public class HelloWorld {
    public static int vowelAmount;
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Scanner in = new Scanner(System.in);
        char word[] = in.next().toCharArray();
        for (int x = 0; x < word.length; x++) {
            for (int i = 0; i < vowels.length; i++) {
                if (word[x] == vowels[i]) {
                    vowelAmount = vowelAmount + 1;
                }
            }
        }
        System.out.println("The amount of vowels are: " + vowelAmount);
    }
}


public class HelloWorld {
    public static double Product(double x,double y) {
        double z;
        z = x * y;
        return z;
    }
    public static void main(String[] args) {
        double x , y;
        Scanner in = new Scanner(System.in);
        x = in.nextDouble();
        y = in.nextDouble();
        System.out.println(Product(x, y));
    }
}

public class HelloWorld {
    public static void oneParam(int x) {
        System.out.println("Number is " + x);
    }
    public static void main(String[] args) {
        int x, y;
        y = 100;
        x = 100;
        oneParam();
    }
}


public class HelloWorld {

    public static void printDifference(int x, int y) {
        int z;
        z = x - y;
        System.out.println("The Diference is: " + z);
    }

    public static double printProduct(double x, double y) {
        double z;
        z = x * y;
        return z;
    }

    public static void main(String[] args) {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Calculator! 1 = Product, 2 = Difference");
        choice = in.nextInt();
        if (choice == 1) {
            double x, y;
            System.out.println("Enter a number: ");
            x = in.nextInt();
            System.out.println("Enter another number: ");
            y = in.nextInt();
            System.out.println(printProduct(x, y));
        } else if (choice == 2){
            int x, y;
            System.out.println("Enter a number: ");
            x = in.nextInt();
            System.out.println("Enter another number: ");
            y = in.nextInt();
            printDifference(x, y);
        } else
            System.out.println("Invalid input!");
    }
}


public class HelloWorld {

    public static void evenOdd(int x) {
        int z;
        z = x % 2;
        if (z == 0) {
            System.out.println("Maximum number is even");
        } else
            System.out.println("Maximum number is odd");
    }

    public static void maxLow(int x, int y, int z) {
        if(x < y && x < z) {
            System.out.println("The minimum number is: " + x);
        } else if (y < x && y < z) {
            System.out.println("The minimum number is: " + y);
        } else if (z < x && z < y) {
            System.out.println("The minimum number is: " + z);
        }

        if(x > y && x > z) {
            System.out.println("The maximum number is: " + x);
            evenOdd(x);
        } else if (y > x && y > z) {
            System.out.println("The maximum number is: " + y);
            evenOdd(y);
        } else if (z > x && z > y) {
            System.out.println("The maximum number is: " + z);
            evenOdd(z);
        }
    }

    public static void main(String[] args) {
        int x, y, z;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();
        maxLow(x, y, z);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        double average;
        int input;
        int score[] = new int[10];

        for(int i = 0; i < 10; i++) {
            input = in.nextInt();
            score[i] = input;
        }

        for(int i = 0; i < 10; i++) {
            sum = score[i] + sum;
        }

        average = sum / 10;
        System.out.println(average);
    }
}


public class HelloWorld {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        int array1[] = new int[3];
        for(int i = 0; i < 3; i++) {
            x = in.nextInt();
            array1[i] = x;
        }
        System.out.println("The elements stored in the first array are :" + Arrays.toString(array1));
        int  array2[] = new int[array1.length];
        for (int i = 0; i <3; i++) {
            array2[i] = array1[i];
        }
        System.out.println("The elements copied into the second array are :" + Arrays.toString(array2));
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        int grades[] = { 56, 89, 11, 34, 90, 78, 63, 25, 99, 6 };
        int ny = 0;
        int x = 0;
        for (int i = 0; i < grades.length; i++) {
            if (ny < grades[i]) {
                x = ny;
                ny = grades[i];
        } else
            continue;
        }
        System.out.println("Your output should be Second highest is : " + x);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        int[][] MultEvenArray = new int[10][10];
        for (int i=0;i < MultEvenArray.length; i++) {
            System.out.println(" ");
            for(int j=0; j < MultEvenArray.length; j++) {
                MultEvenArray[i][j] = ((i+1) * 2) * ((j+1) * 2);
                System.out.print(MultEvenArray[i][j]);
                System.out.print(" ");
            }
        }
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        String line1s1 = "You don't ";
        String line1s2 = "know, babe ";
        String line1 = line1s1.concat(line1s2);
        String line2s1 = "When you ";
        String line2s2 = "hold me ";
        String line2 = line2s1.concat(line2s2);
        String line3s1 = "And kiss ";
        String line3s2 = "me slowly ";
        String line3 = line3s1.concat(line3s2);
        String line4s1 = "It's the ";
        String line4s2 = "sweetest thing ";
        String line4 = line4s1.concat(line4s2);
        String line5s1 = "And it ";
        String line5s2 = "don't change ";
        String line5 = line5s1.concat(line5s2);
        String line6s1 = "If I had it ";
        String line6s2 = "my way ";
        String line6 = line6s1.concat(line6s2);
        String line7s1 = "You would know ";
        String line7s2 = "that you are ";
        String line7 = line7s1.concat(line7s2);
        String paragraph = (line1 + line2 + line3 + line4 + line5 + line6 + line7);
        int lengthString = paragraph.length();
        System.out.println(paragraph.toUpperCase() + "Length of pragraph: " + lengthString);
    }
}

public class HelloWorld {

    public static int consonant;
    public static int vowel;
    public static int non_alpha;

    public static void Cons(String x) {
        x = x.toLowerCase();
        for (int i = 0; i < x.length(); ++i) {
            char ch = x.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                ++consonant;
            }
        }
        System.out.println("Consonants: " + consonant);
    }

    public static void Vow(String x) {
        x = x.toLowerCase();
        for (int i = 0; i < x.length(); ++i) {
            char ch = x.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowel;
            }
        }
        System.out.println("Vowels: " + vowel);
    }

    public static void Non(String x) {
        x = x.toLowerCase();
        for (int i = 0; i < x.length(); ++i) {
            char ch = x.charAt(i);

            if (ch >= '0' && ch <= '9') {
                ++non_alpha;
            }
        }
        System.out.println("Numbers: " + non_alpha);
    }

    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);
        int consonant, vowel, non_alpha;
        System.out.println("Enter string: ");
        String str = in.nextLine();

        Cons(str);
        Vow(str);
        Non(str);
    }
}

public class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String employee[] = new String[5];
        for (int i = 0; i < 5; i++) { //
            employee[i] = "";
        String constants[] = {"Employee ID: ", " Last Name: ", " First Name: ", " Position: ", " Rate Per Day: P"};
        String information[] = new String[5];
        System.out.println("Enter 5 employee informations: EmpID,Lastname,Firstname,Position,Rateperday. Separated by comma.");
        String infos = in.nextLine();
        char[] letterInfo = new char[infos.length()];
        for (int z = 0; z < infos.length(); z++) {
            letterInfo[z] = infos.charAt(z);
        }
        int x = 0;
        for (int v = 0; v < 5; v++) {
            information[v] = "";
            while (true) {
                information[v] = information[v] + letterInfo[x];
                if (infos.length() <= (x + 1)) {
                    break;
                }
                x++;
                if (letterInfo[x] == ',') {
                    break;
                }
            }
            x = x + 1;
        }
            for (int y = 0; y < information.length; y++) {
                employee[i] = employee[i] + constants[y] + information[y];
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(employee[i]);
        }
        System.out.println("Search Employee Enter Employee ID: ");
        String employeeID = in.nextLine();
        char[] IDchar = new char[employeeID.length()];
        for (int z = 0; z < employeeID.length(); z++) {
            IDchar[z] = employeeID.charAt(z);
        }
        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < employeeID.length(); x++) {
                int index = employee[i].indexOf(IDchar[x]);
                if (x == employeeID.length() - 1) {
                    System.out.println("Search result: " + employee[i]);
                    break;
                }
                if (index == -1) {
                    break;
                } else
                    continue;
            }
            if (i == 4) {
                System.out.println("Failed to find Employee ID!");
            }
        }
    }
}

 */

public class HelloWorld {
    static boolean FuncX(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
            String str = "deified";
            if (FuncX(str))
                System.out.println("Yes");
            else
                System.out.print("No");
        }
}
