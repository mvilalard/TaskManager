package com.esgi.mivi;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;

public class TaskShower {

    public static void showTasks(TaskManager manager){
        LocalDateTime currentDate = LocalDateTime.now();
        ArrayList<Task> taskList = manager.getTaskList();
        Collections.sort(taskList);
        for(int i = 0; i < taskList.size(); i++) {
            Task currentTask = taskList.get(i);
            System.out.println(TaskShower.buildTaskLabel(currentTask, currentDate));
        }
    }

    /**
     * Creates the label to display for a task
     * @param task task to diplay
     * @param current current date
     * @return label
     */
    private static String buildTaskLabel(Task task, LocalDateTime current) {
        return "[" + TaskShower.getDateDiff(task.getCreationDate(), current)+"] " + task.getNote();
    }
    /**
     * Get a diff between two dates
     * @param date1 the oldest date
     * @param date2 the newest date
     * @return the diff value, String formatted
     */
    public static String getDateDiff(LocalDateTime date1, LocalDateTime date2) {
        LocalDateTime tempDateTime = LocalDateTime.from( date1 );
        StringBuilder builder = new StringBuilder();

        long years = tempDateTime.until( date2, ChronoUnit.YEARS );
        tempDateTime = tempDateTime.plusYears( years );
        if(years != 0)
            builder.append(years + "y ");

        long months = tempDateTime.until( date2, ChronoUnit.MONTHS );
        tempDateTime = tempDateTime.plusMonths( months );
        if(months != 0)
            builder.append(months + "m ");

        long days = tempDateTime.until( date2, ChronoUnit.DAYS );
        tempDateTime = tempDateTime.plusDays( days );
        if(days != 0)
            builder.append(days + "d ");


        long hours = tempDateTime.until( date2, ChronoUnit.HOURS );
        tempDateTime = tempDateTime.plusHours( hours );
        if(hours != 0)
            builder.append(hours + "h ");

        long minutes = tempDateTime.until( date2, ChronoUnit.MINUTES );
        tempDateTime = tempDateTime.plusMinutes( minutes );
        if(minutes != 0)
            builder.append(minutes + "m ");

        return builder.toString();
    }
}
