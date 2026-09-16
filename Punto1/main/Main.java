package main;

import central.MonitoringCenter;
import staff.Doctor;
import staff.HeadNurse;
import staff.HeadBacteriologist;

public class Main {
    public static void main(String[] args) {
        MonitoringCenter monitoringCenter = new MonitoringCenter();

        Doctor elenaRamos = new Doctor("Elena Ramos");
        HeadNurse andresSuarez = new HeadNurse("Andrés Suárez");
        HeadBacteriologist martaGomez = new HeadBacteriologist("Marta Gómez");

        monitoringCenter.subscribe(elenaRamos);
        monitoringCenter.subscribe(andresSuarez);
        monitoringCenter.subscribe(martaGomez);

        monitoringCenter.reportVitalSignsAlert("Patient in room 204 has critical oxygen saturation");
        monitoringCenter.reportPriorityChange("Patient in room 108 changed to code red");
        monitoringCenter.reportLabRequest("Patient in room 305 needs urgent blood test");

        monitoringCenter.unsubscribe(andresSuarez);

        monitoringCenter.reportPriorityChange("Patient in room 202 changed to code blue");
    }
}