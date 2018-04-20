package com.itschool;

public class Pupil {
    protected String fio;

    public byte getMark() {
        return mark;
    }

    public void setMark(byte mark) {
        this.mark = (mark < 1 || mark > 12 ? 1 : mark);
    }

    protected byte mark;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Pupil() {
        this.fio = "NoName";
    }

    public Pupil(String fio) {
        this.fio = fio;
    }

    void  Study()
    {
        System.out.println("I'm studying");
    }

    void Read()
    {
        System.out.println("I'm reading");
    }

    void Write()
    {
        System.out.println("I'm writing");
    }

    void Relax()
    {
        System.out.println("I'm relaxing");
    }


}
