package Lesson9_tasks;

import java.util.ArrayList;
import java.util.Date;

class Note {
    private String text;

    public Note(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

class DayNotes {
    private Date date;
    private ArrayList<Note> notes;

    public DayNotes(Date date) {
        this.date = date;
        this.notes = new ArrayList<Note>();
    }

    public void addNote(Note note) {
        this.notes.add(note);
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public Date getDate() {
        return date;
    }
}

public class notePad {
    private ArrayList<DayNotes> days;

    public void Notepad() {
        this.days = new ArrayList<DayNotes>();
    }

    public void addNote(Date date, Note note) {
        for (DayNotes day : days) {
            if (day.getDate().equals(date)) {
                day.addNote(note);
                return;
            }
        }
        DayNotes newDay = new DayNotes(date);
        newDay.addNote(note);
        days.add(newDay);
    }

    public ArrayList<DayNotes> getDays() {
        return days;
    }
}
