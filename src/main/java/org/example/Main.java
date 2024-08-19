package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    }
        public static int add(int a, int b){
            return a+b;
        }

        public static int sub(int a, int b){
            return a-b;
        }

        public static boolean isEven(int a){
        return a%2 == 0;
        }

        public static int mult (int a, int b){
        return a*b;
        }

        public static String toUpperCase(String s){
        return s.toUpperCase();
        }

        public static boolean containsHello(String s){
            String [] helloInDifferentLanguages = {"hello", "ciao", "hallo", "salut", "hola", "ahoj", "czesc"};
            for (String word : helloInDifferentLanguages) {
                if (s.toLowerCase().contains(word)) {
                    return true;
                }
            }
            return false;
        }
}