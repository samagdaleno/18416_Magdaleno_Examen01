package com.example.sam.banpatito2;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by Sam on 08/09/2017.
 */

public class CustomerModel implements Parcelable {
    private int number;
    private String name;
    private int operations;

    public CustomerModel(int number, String name, int operations){
        this.number = number;
        this.name = name;
        this.operations = operations;
    }

    public CustomerModel(Parcel in) {
        this.number = in.readInt();
        this.name = in.readString();
        this.operations = in.readInt();
    }


    public int getOperations() {return operations;}
    public void setOperations(int operations) {this.operations = operations;}

    public String getName() {return name;}

    public int getNumber() {return number; }
    public void setNumber(int number) { this.number = number; }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(number);
        dest.writeString(name);
        dest.writeInt(operations);
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        public CustomerModel createFromParcel(Parcel in){
            return new CustomerModel(in);
        }
        public CustomerModel[] newArray(int size) {
            return new CustomerModel[size];
        }
    };
}