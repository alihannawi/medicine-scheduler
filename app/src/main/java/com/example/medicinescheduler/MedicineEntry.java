package com.example.medicinescheduler;

import java.time.*;

public class MedicineEntry {
    String medicineName;
    Float medicineDose;
    boolean [] daysOfWeek;
    Clock medicineTime;

    public MedicineEntry(String medicineName, Float medicineDose,
                         boolean [] daysOfWeek, Clock medicineTime) {
        this.medicineName = medicineName;
        this.medicineDose = medicineDose;
        this.daysOfWeek = daysOfWeek;
        this.medicineTime = medicineTime;
    }

    public Clock getMedicineTime() {
        return medicineTime;
    }

    public void setMedicineTime(Clock medicineTime) {
        this.medicineTime = medicineTime;
    }

    public boolean[] getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(boolean[] daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    public Float getMedicineDose() {
        return medicineDose;
    }

    public void setMedicineDose(Float medicineDose) {
        this.medicineDose = medicineDose;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }
}
