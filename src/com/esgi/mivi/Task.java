package com.esgi.mivi;

import java.time.LocalDateTime;
import java.util.Date;

public class Task implements Comparable<Task>
{
    private LocalDateTime creationDate;
    private String note;

    public Task(LocalDateTime creationDate, String note) {
        this.creationDate = creationDate;
        this.note = note;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public int compareTo(Task o) {
        return this.getCreationDate().compareTo(o.getCreationDate());
    }
}
