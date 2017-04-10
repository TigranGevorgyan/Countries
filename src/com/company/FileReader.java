package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Taron on 04/09/17.
 */
public class FileReader {

    ArrayList<Country> countries;

    public FileReader() {
        countries = new ArrayList<>();
    }

    public void createCountry() throws FileNotFoundException {
        int idNumber = 0;
        Scanner scanner = new Scanner(new File("D:\\projects\\Countries\\src\\countries.csv"));
        while (scanner.hasNext()){
            String[] strings = scanner.nextLine().split(",");
            for (int i = 0;i < strings.length; i++){
                for (int j = 0;j < strings[i].length(); j++){
                    if(strings[i].charAt(j) == '"') {
                        strings[i] = strings[i].replace('"',' ').trim();
                    }
                }
            }
            countries.add(new Country(idNumber++,strings[0],strings[1],strings[2]));
        }
    }

    public void start() throws FileNotFoundException {
        createCountry();
        sortingByIndex();
    }

    public void sortingByIndex(){
        System.out.println("Enter index for sorting.");
        System.out.println("1 sorting by id, 2 sorting by country code, 3 sorting by english name, 4 sorting by french name.");
        Scanner scanner = new Scanner(System.in);
        int sortingIndex = scanner.nextInt();
        switch (sortingIndex){
            case 1:
                Collections.sort(countries,new SortingById());
                System.out.println("Sorting by id.");
                break;
            case 2:
                Collections.sort(countries,new SortingByCountryCode());
                System.out.println("Sorting by country code.");
                break;
            case 3:
                Collections.sort(countries,new SortingByEnglishName());
                System.out.println("Sorting by english name.");
                break;
            case 4:
                Collections.sort(countries,new SortingByFrenchName());
                System.out.println("Sorting by french name.");
                break;
            default:
                System.out.println("Fault index for sorting.Default sorting by country code.");
        }

        for (Country element : countries)
            System.out.println(element);
    }


}
