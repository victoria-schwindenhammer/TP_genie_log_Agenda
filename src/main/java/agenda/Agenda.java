package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {

    public ArrayList<Event> listEvenement;

    public Agenda(ArrayList<Event> listEvenement) {
        this.listEvenement = listEvenement;
    }

    @Override
    public String toString() {
        return "Agenda{" + "listEvenement=" + listEvenement + '}';
    }

    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {
        // TODO : implémenter cette méthode
        this.listEvenement.add(e);

    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        // TODO : implémenter cette méthode
       ArrayList <Event> listEvenementDuJour= new ArrayList() ;
        for( Event value : listEvenement) {
            if (value.isInDay(day)){
                listEvenementDuJour.add(value);

            }
        }
                return listEvenementDuJour;
    }

/**
 * Trouver les événements de l'agenda en fonction de leur titre
 *
 * @param title le titre à rechercher
 * @return les événements qui ont le même titre
 */
public List<Event> findByTitle(String title) {
        ArrayList<Event> listTitre = new ArrayList<Event>();
        for (Event value : listEvenement) {
            if (value.getTitle() == title) {
                listTitre.add(value);
            }
        }
        return listTitre;
    }
    
    /**
     * Déterminer s’il y a de la place dans l'agenda pour un événement
     * @param e L'événement à tester (on se limitera aux événements simples)
     * @return vrai s’il y a de la place dans l'agenda pour cet événement
     */
    public boolean isFreeFor(Event e) {
        for(Event value : listEvenement) {
            if (e.getStart()==value.getStart()){
                return false;
            }
        }
    return true;
    }
}