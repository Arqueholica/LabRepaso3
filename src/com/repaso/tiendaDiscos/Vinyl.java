package com.repaso.tiendaDiscos;



import java.util.Scanner;

public class Vinyl {
    private String Title;
    private String Artist;
    private String releaseYear;
    private int duration;
    private int amountOfDiscs;



//    CONSTRUCTOR

    public Vinyl(String title, String artist, String releaseYear, int duration, int amountOfDiscs) {
        Title = title;
        Artist = artist;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.amountOfDiscs = amountOfDiscs;
    }

    //    GETTERS AND SETTERS

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public String getReleaseYear() { return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getAmountOfDiscs() {
        return amountOfDiscs;
    }

    public void setAmountOfDiscs(int amountOfDiscs) {
        this.amountOfDiscs = amountOfDiscs;
    }


// MY LITTLE METHODS






//     VISUALIZADORES


    @Override
    public String toString() {
        return "DISCO de VINILO - Características: " + '\n' +
                "Título: " + Title + '\n' +
                "Artista: " + Artist + '\n' +
                "Año de Publicación: " + releaseYear + '\n' +
                "Duración: " + duration + "min." + '\n' +
                "Cantidad de Discos: " + amountOfDiscs + '\n' +
                "____________________________________________" + '\n';
    }
}
