package com.example.test2;

import android.os.Parcel;
import android.os.Parcelable;

public class Student  implements Parcelable{
    private Integer rollno;
    private String name;
    private Integer age;

    public Student(Integer rollno, String name, Integer age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    protected Student(Parcel in) {
        if (in.readByte() == 0) {
            rollno = null;
        } else {
            rollno = in.readInt();
        }
        name = in.readString();
        if (in.readByte() == 0) {
            age = null;
        } else {
            age = in.readInt();
        }
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int describeContents() {
        return 0;
    }
    public static Creator<Student> getCREATOR(){
        return CREATOR;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (rollno == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(rollno);
        }
        parcel.writeString(name);
        if (age == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(age);
        }
    }
}
