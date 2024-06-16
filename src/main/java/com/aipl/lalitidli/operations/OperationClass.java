package com.aipl.lalitidli.operations;

import com.aipl.lalitidli.Components.TrayRack;

public class OperationClass {
 public static double getTrayRadius(int deepCount) {
        if (deepCount >= Limitations.MINIMUMDEEPCOUNTSMALL && deepCount <= Limitations.MAXIMUMDEEPCOUNTSMALL) {
            return Values.smallTrayRadius;
        } else if (deepCount >= Limitations.MINIMUMDEEPCOUNTMEDIUM && deepCount <= Limitations.MAXIMUMDEEPCOUNTMEDIUM) {
            return Values.mediumTrayRadius;

        } else if (deepCount >= Limitations.MINIMUMDEEPCOUNTLARGE && deepCount <= Limitations.MAXIMUMDEEPCOUNTLARGE) {
            return Values.largeTrayRadius;
        } else {
            return 0;
        }
    }

    public static void getTrayRackEstimate(TrayRack trayRack) {
        System.out.println("**************************************");
        System.out.println("Tray Radius " + trayRack.getTray().getRadius());
        System.out.println("Tray Area " + trayRack.getTray().getCircleArea());
        System.out.println("Deep Radius " + trayRack.getTray().getDeep().getRadius());
        System.out.println("Deep Volume " + trayRack.getTray().getDeep().getHemispherVolume());
        System.out.println("Deep Count " + trayRack.getTray().getDeepCount());
        System.out.println("Tray Count " + trayRack.getTrayCount());
        System.out.println("Rack Radius " + trayRack.getRack().getRadius());
        System.out.println("Rack Height " + trayRack.getRack().getHeight());
        System.out.println("Rack Volume " + trayRack.getRack().getCylinderVolume());
        System.out.println("Batter Capacity for one Deep " + trayRack.getTray().getIndividualDeepVolume() * Values.batterDensity);
        System.out.println("Batter Capacity for All Deep in One Tray " + trayRack.getTray().getTotalDeepVolume() * Values.batterDensity);
        System.out.println("Batter Capacity for All Deep in All Tray " + trayRack.getTotalAllTrayDeepVolume() * Values.batterDensity);
        System.out.println("**************************************");
    }    
}
