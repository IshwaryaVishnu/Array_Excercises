package se.lexicon;
import java.util.*;

public class SortArray {
    public static void main(String[]args){
        String[] countries = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(countries);
        for (String sortCountries : countries) {
             System.out.print(sortCountries+" ");

        }


    }
}

