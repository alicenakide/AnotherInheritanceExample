package com.company;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie();
        movie.name = "Titanic";
        movie.numberOfArtists = 100;
        movie.releaseDate = "12/02/2018";
        movie.collectionsFirstWeek = 500.79;
        movie.collectionsRestOfTheDays = 1000.89;
        movie.director ="James Cameroon";
        movie.stuntMaster ="Alice James";


        movie.print();

        System.out.println("*************************************");


        Drama drama = new Drama();
        drama.name = "This Is Us";
        drama.numberOfArtists = 800;
        drama.releaseDate = "15/10/2012";
        drama.collectionsFirstWeek = 300;
        drama.collectionsRestOfTheDays =400;
        drama.writer = "Shonda Rhimes";
        drama.stageSetter ="Karan Deepak";

        drama.print();

        System.out.println("*************************************");


        Circus circus = new Circus();

        circus.name = "Nyege Nyege";
        circus.numberOfArtists = 200;
        circus.ringMaster = "John Paul";

        circus.print();

    }
}

class Entertainment{

    String name;
    int numberOfArtists;
    String releaseDate;
    double collectionsFirstWeek;
    double collectionsRestOfTheDays;

    double getTotalCollections(){

        return collectionsFirstWeek + collectionsRestOfTheDays;
    }

    void printEntertainment(){

        System.out.println(name + " got the following collections" );
        System.out.println("First Week : " + collectionsFirstWeek);
        System.out.println("Rest Of The days : " + collectionsRestOfTheDays);
        System.out.println("Total Collections : " + getTotalCollections());
        System.out.println("Total Artists : " + numberOfArtists);
        System.out.println("Release Dae : " + releaseDate);
    }
}
class Movie extends Entertainment{

    String director;
    String stuntMaster;


    void print(){
        printEntertainment();
        System.out.println("Director : " + director);
        System.out.println(" Stunt Master : " + stuntMaster);
    }
}

class Drama extends Entertainment{

    String writer;
    String stageSetter;

    void print()
    {
        printEntertainment();
        System.out.println("Writer : " + writer);
        System.out.println("Stage Setter : " + stageSetter);
    }
}

class Circus extends Entertainment{

    String ringMaster;

    void print()
    {

        printEntertainment();
        System.out.println("Ring Master : " + ringMaster);
    }
}

