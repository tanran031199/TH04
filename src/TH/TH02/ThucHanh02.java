package TH.TH02;

import java.util.Scanner;

public class ThucHanh02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zacharian", "Mallory", "Zoe", "Emily"};
        String[] newList = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            newList[i] = students[i].toLowerCase();
        }
        System.out.println("Enter a name's student: ");
        String name = sc.nextLine().toLowerCase();

        boolean isExist = false;

        for (int i = 0; i < newList.length; i++) {
            if(newList[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + i);
                isExist = true;
                break;
            }
        }

        if(!isExist) {
            System.out.println("Not found " + name + " in the list.");
        }
    }
}
