package string.problems;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";



            // splitting words using regex
            String[] words = st.split("\\W");

            // creating object of HashSet class implemented by
            Set<String> set = new HashSet<>();

            // here we are iterating in Array
            for (int i = 0; i < words.length - 1; i++) {

                for (int j = 1; j < words.length; j++) {

                    // if strings matched then adding strings in
                    // Set because if we ad same string set will
                    // remove one and we have only repeated
                    // words.
                    if (words[i].equals(words[j]) && i != j) {
                        set.add(words[i]);
                    }
                }
            }

            // here we are printing the set
            System.out.println(set);
        }
    }


