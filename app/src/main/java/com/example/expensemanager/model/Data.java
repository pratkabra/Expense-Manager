package com.example.expensemanager.model;

public class Data {
    private float amount;
    private String type;
    private String note;
    private String id;

    //public Data(float amount, String type, String note, String id, String mDate){ }

    public Data(float amount, String type, String note, String id, String date) {
        this.amount = amount;
        this.type = type;
        this.note = note;
        this.id = id;
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount){ this.amount = amount; }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String date;
}
