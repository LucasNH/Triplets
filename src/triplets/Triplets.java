/*
 * Author: Lucas Noritomi-Hartwig
 * Date created: February 25, 2020
 * Date last edited: February 27, 2020
 * Program title: Triplets.java
 * This program randomly generates a poem using either an AAA
 * or an ABA rhyming pattern with roughly fifty-fifty odds,
 * using arrays for each noun, verb, and rhyming noun.
 */
package triplets;

import java.util.ArrayList;

public class Triplets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //This program will use a dynamic arrays
        ArrayList<String> nouns = new ArrayList();
        nouns.add("cat");
        nouns.add("dog");
        nouns.add("horse");
        nouns.add("goat");
        nouns.add("eagle");
        nouns.add("lion");
        nouns.add("giraffe");

        ArrayList<String> verbs = new ArrayList();
        verbs.add("ate");
        verbs.add("slept");
        verbs.add("jumped");
        verbs.add("raced");
        verbs.add("ran");
        verbs.add("tripped");
        verbs.add("guessed");
        verbs.add("tapped");
        verbs.add("bit");

        ArrayList<String> rhymingNounsArr1 = new ArrayList();
        rhymingNounsArr1.add("mouse");
        rhymingNounsArr1.add("blouse");
        rhymingNounsArr1.add("grouse");
        rhymingNounsArr1.add("house");
        rhymingNounsArr1.add("spouse");
        rhymingNounsArr1.add("doghouse");
        rhymingNounsArr1.add("beachhouse");
        rhymingNounsArr1.add("treehouse");

        ArrayList<String> rhymingNounsArr2 = new ArrayList();
        rhymingNounsArr2.add("file");
        rhymingNounsArr2.add("trial");
        rhymingNounsArr2.add("smile");
        rhymingNounsArr2.add("pile");
        rhymingNounsArr2.add("bile");
        rhymingNounsArr2.add("Nile");
        rhymingNounsArr2.add("tile");
        rhymingNounsArr2.add("isle");
        rhymingNounsArr2.add("Kyle");

        String noun;
        String verb1, verb2, verb3;
        String rhymingNoun1, rhymingNoun2, rhymingNoun3;
        int randomNum;

        //get a random noun from the nouns array
        //use .size() to get the # of elements
        randomNum = (int) (Math.random() * nouns.size());
        noun = nouns.get(randomNum);

        //get the first random verb from the verbs array &
        // remove from ArrayList
        randomNum = (int) (Math.random() * verbs.size());
        verb1 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the second random verb from verbs array and remove it
        randomNum = (int) (Math.random() * verbs.size());
        verb2 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the second random verb from verbs array and remove it
        randomNum = (int) (Math.random() * verbs.size());
        verb3 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the first rhyming noun from first array and remove it
        randomNum = (int) (Math.random() * rhymingNounsArr1.size());
        rhymingNoun1 = rhymingNounsArr1.get(randomNum);
        rhymingNounsArr1.remove(randomNum);

        //get the thrid rhyming noun from first array and remove it
        randomNum = (int) (Math.random() * rhymingNounsArr1.size());
        rhymingNoun3 = rhymingNounsArr1.get(randomNum);
        rhymingNounsArr1.remove(randomNum);

        double rhymingPattern = (double) (Math.random());

        //Display the poem
        if (rhymingPattern < 0.5) { // AAA rhyming pattern
            //get the second rhyming noun from first array and remove it
            randomNum = (int) (Math.random() * rhymingNounsArr1.size());
            rhymingNoun2 = rhymingNounsArr1.get(randomNum);
            rhymingNounsArr1.remove(randomNum);
            System.out.println("The " + noun + " " + verb1 + " a "
                    + rhymingNoun1 + "\nAnd then " + verb2
                    + " it in the " + rhymingNoun2 + "\nBut then the "
                    + noun + " " + verb3 + " the " + rhymingNoun3);
        } else { // ABA rhyming pattern
            //get the second rhyming noun from first array and remove it
            randomNum = (int) (Math.random() * rhymingNounsArr2.size());
            rhymingNoun2 = rhymingNounsArr2.get(randomNum);
            rhymingNounsArr2.remove(randomNum);
            System.out.println("The " + noun + " " + verb1 + " a "
                    + rhymingNoun1 + "\nAnd then " + verb2
                    + " it in the " + rhymingNoun2 + "\nBut then the "
                    + noun + " " + verb3 + " the " + rhymingNoun3);
        }

    }

}
