package com.aipl.lalitidli.Components;

import com.aipl.lalitidli.shape.HemisphereInterface;

public class Deep implements HemisphereInterface {

    private double radius;

    public Deep(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getHemispherVolume() {
        return 3.14 * radius * radius*radius;
    }

}
