package com.aipl.LalitIdliSanchaMakerPvtLtdProject;

import com.aipl.lalitidli.Components.TrayRack;
import com.aipl.lalitidli.operations.OperationClass;
import com.aipl.lalitidli.operations.Validation1;

public class LalitIdliSanchaMakerPvtLtdProject {

    public static void main(String[] args) {
        double deepRadius = 3.5;
        int deepCount = 5;
        int trayCount = 3;
        double rackRadius = 12;
        double rackHeight = 60;
        double trayRadius = OperationClass.getTrayRadius(deepCount);
        Validation1 valid = new Validation1();
        boolean validateTrayCount = valid.validateTrayCount(trayCount);
        boolean deepTrayRadius = valid.validateTrayDeepSurface(deepRadius, trayRadius, deepCount);
        boolean validateTrayRackRadius = valid.validateTrayRackRadius(trayRadius, rackRadius);
        boolean validateTrayRackHeight = valid.validateTrayRackHeight(deepRadius, rackHeight, trayCount);
        if (validateTrayCount == true && deepTrayRadius == true && validateTrayRackRadius == true && validateTrayRackHeight == true) {
            TrayRack trayRack = new TrayRack(trayRadius, deepRadius, deepCount, rackRadius, rackHeight, trayCount);

            OperationClass.getTrayRackEstimate(trayRack);
        }
    }
}
