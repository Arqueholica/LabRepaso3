package com.repaso.tiendaDiscos;

import java.util.ArrayList;

/*
DAVID 🆘 creo que no teníamos que crear una clase aparte ¿verdad? Acabo de caer en que no es eso lo que se pedía.
Y ahora no sé cómo entrar en cada parte del objeto; he intentado forear pero me da el objeto completo *cries in Spanish*
Te preguntaré el lunes pero bueno, dejo constancia por aquí.
 */

public class vinylStore {
    public static void main(String[] args) {



   Vinyl vinyl1 = new Vinyl("Lane Lea", "Queen", "2024", 120, 2);
   Vinyl vinyl2 = new Vinyl("Live In Texas", "Linkin Park", "2000", 120, 3);
   Vinyl vinyl3 = new Vinyl("T.N.T", "AC/DC", "1978", 90, 1);
   Vinyl vinyl4 = new Vinyl("Esto es Estopa - Deluxe", "Estopa", "1999", 60, 2);
   Vinyl vinyl5 = new Vinyl("El Vals del Obrero", "Ska-P", "1996", 45, 1);

        ArrayList<Object> vinylDisc = new ArrayList<>();
        vinylDisc.add(vinyl1);
        vinylDisc.add(vinyl2);
        vinylDisc.add(vinyl3);
        vinylDisc.add(vinyl4);
        vinylDisc.add(vinyl5);

        System.out.println(vinylDisc);

        System.out.println('\n');
        System.out.println("Solo un dato de un disco, en este caso el título: " + "'" + vinyl4.getTitle() + "'" );

        System.out.println('\n');
        System.out.println("Cambiar un dato, el año de disco 3");
        vinyl3.setReleaseYear("2031");
        System.out.println("Año nuevo: " + vinyl3.getReleaseYear());

        System.out.println('\n');
        System.out.println("Disco completo con año nuevo: " + vinyl3);



        }



        }










