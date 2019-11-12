package com.rakovets.course.challenge.Task1;

public class Time {
    int hours;
    int minutes;
    int seconds;
    Time(int totalSeconds){

    }
    Time(int hours, int minutes, int seconds){

    }

    public Time() {

    }

    int getHours(){
        return hours;
    }
    void setHours(int hours){
        this.hours = hours;
    }
    int getMinutes(){
        return minutes;
    }
    void setMinutes(int minutes){
        this.minutes = minutes;
    }
    int getSeconds(){
        return seconds;
    }
    void setSeconds(int seconds){
        this.seconds = seconds;
    }
    void getTotalSeconds(int totalSeconds){
        seconds = totalSeconds % 60;
        minutes = totalSeconds / 60 % 60;
        hours = totalSeconds / 3600 % 60;
    }
}
