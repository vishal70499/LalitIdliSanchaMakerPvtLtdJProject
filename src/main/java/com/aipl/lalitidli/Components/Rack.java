package com.aipl.lalitidli.Components;

import com.aipl.lalitidli.shape.CylinderInterface;
import com.aipl.lalitidli.trayrack.RackInterface;

public class Rack implements CylinderInterface, RackInterface {

    public double CylinderRadius;
    public double CylinderHeight;
    public int TrayCount;

    public Rack(double CylinderRadius, double CylinderHeight, int TrayCount) {
        this.CylinderRadius = CylinderRadius;
        this.CylinderHeight = CylinderHeight;
        this.TrayCount = TrayCount;
    }

    @Override
    public double getRackVolume() {
        return getCylinderVolume();
    }

    @Override
    public int getTrayCount() {
        return TrayCount;
    }

    @Override
    public double getRadius() {
        return CylinderRadius;
    }

    @Override
    public void setRadius(double radius) {
        CylinderRadius = radius;
    }

    @Override
    public double getHeight() {
        return CylinderHeight;
    }

    @Override
    public void setHeight(double height) {
        CylinderHeight = height;
    }

    @Override
    public double getCylinderVolume() {
        return 3.14 * CylinderRadius * CylinderRadius * CylinderHeight;

    }

}
