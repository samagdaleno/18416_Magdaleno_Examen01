package com.example.sam.banpatito;

import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Sam on 08/09/2017.
 */

public class CustomerModel implements Serializable {
    private int number;
    private String name;
    private int operations;

    public int getOperations() {return operations;}
    public void setOperations(int operations) {this.operations = operations;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getNumber() {return number; }
    public void setNumber(int number) { this.number = number; }

    public CustomerModel(int number, String name, int operations){
        this.number = number;
        this.name = name;
        this.operations = operations;
    }
}