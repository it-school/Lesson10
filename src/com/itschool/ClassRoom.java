package com.itschool;

public class ClassRoom {
    private Pupil[] pupils;

    public ClassRoom(String[] names, byte[] marks) {
        this.pupils = new Pupil[marks.length];
        for (int i = 0; i < marks.length; i++) {
            switch (marks[i])
            {
                case 12 : case 11: case 10 :
                pupils[i] = new ExcelentPupil(names[i]);
                break;
                case 9 : case 8 : case 7 :
                pupils[i] = new GoodPupil(names[i]);
                break;
                default:
                    pupils[i] = new BadPupil(names[i]);
            }
        }
    }

    public Pupil[] getPupils() {
        return pupils;
    }

    public void setPupils(Pupil[] pupils) {
        this.pupils = pupils;
    }

    public ClassRoom() {
        pupils = new Pupil[1];
        pupils[0] = new Pupil();
    }

    public ClassRoom(int numberOfPupils) {
        pupils = new Pupil[numberOfPupils > 0 ? numberOfPupils : 1];
        for (int i = 0; i < pupils.length; i++) {
            pupils[i] = new Pupil();
        }
    }

    public ClassRoom(String[] pupilsFIOs) {
        this.pupils = new Pupil[pupilsFIOs.length];
        for (int i = 0; i < pupilsFIOs.length; i++) {
            this.pupils[i] = new Pupil(pupilsFIOs[i]);
        }
    }

    public ClassRoom(byte[] marks) {
        this.pupils = new Pupil[marks.length];
        for (int i = 0; i < marks.length; i++) {
            switch (marks[i])
            {
                case 12 : case 11: case 10 :
                    pupils[i] = new ExcelentPupil();
                    break;
                case 9 : case 8 : case 7 :
                    pupils[i] = new GoodPupil();
                    break;
                default:
                    pupils[i] = new BadPupil();
            }
        }
    }
}
