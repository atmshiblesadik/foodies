package com.shiblesadik.foodies.models.datetime;

import java.util.Date;

public class DateTime {
    private String isoDate;
    private String date;
    private String day;
    private String time;
    private Date javaDate;

    public DateTime() {
    }

    public DateTime(String isoDate, String date, String day, String time) {
        this.isoDate = isoDate;
        this.date = date;
        this.day = day;
        this.time = time;
    }

    public String getIsoDate() {
        return isoDate;
    }

    public void setIsoDate(String isoDate) {
        this.isoDate = isoDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "DateTime{" +
                "isoDate='" + isoDate + '\'' +
                ", date='" + date + '\'' +
                ", day='" + day + '\'' +
                ", time='" + time + '\'' +
                ", javaDate=" + javaDate +
                '}';
    }
}
