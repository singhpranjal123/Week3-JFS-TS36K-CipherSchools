

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader("d:\\User\\File.txt");

        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        System.out.println(line);
        String line1;

        while ((line1=br.readLine())!=null){
            System.out.println(line1);
        }
        ArrayList<String> pokemons=new ArrayList<>();
        while ((line=br.readLine()) != null){
//            System.out.println(line);
            pokemons.add(line);
        }
        System.out.println("Total Pokemons: "+pokemons.size());

        ArrayList<String> pokemonTitle=new ArrayList<>();
        for (String pok:pokemons){
            String title=pok.split(",")[0];
            pokemonTitle.add(title);
        }
        System.out.println(pokemonTitle);


        Scanner sc=new Scanner(System.in);
        String type=sc.next();
        HashSet ptypes=new LinkedHashSet<>();

        if (!ptypes.contains(type)){
            System.out.println("Invlaid Pokemon Type");
            return;
        }
        for (String pok:pokemons){
            String ptype=pok.split(",")[1];
            if (ptype.equals(type)){
                System.out.println(pok);
            }
        }



        br.close();
        fr.close();

    }
}