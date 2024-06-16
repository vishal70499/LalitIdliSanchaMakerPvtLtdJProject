/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aipl.lalitidli.Components;

import com.aipl.lalitidli.shape.CircleInterface;
import com.aipl.lalitidli.trayrack.TrayInterface;

/**
 *
 * @author Lenovo
 */
public class Tray implements CircleInterface, TrayInterface {

    public double radius;
    public int deepCount;
    public double deepRadius;
    public double TrayRadius;
    public Deep deep;

    public Tray(double radius, int deepCount, double deepRadius, double TrayRadius) {
        this.radius = radius;
        this.deepCount = deepCount;
        this.deepRadius = deepRadius;
        this.TrayRadius = TrayRadius;
        deep=new Deep(radius);
    }

    @Override
    public double getCircleArea() {
        return PI * radius * radius;
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
    public int getDeepCount() {
        return deepCount;
    }

    @Override
    public double getDeepRadius() {
        return deep.getRadius();
    }

    @Override
    public double getTrayArea() {
        return 3.14 * TrayRadius * TrayRadius;
    }

    @Override
    public double getIndividualDeepVolume() {
        return deep.getHemispherVolume();
    }

    @Override
    public double getTotalDeepVolume() {
        return deepCount * getIndividualDeepVolume();
    }

    public double getTrayRadius() {
        return TrayRadius;
    }

    public void setTrayRadius(double TrayRadius) {
        this.TrayRadius = TrayRadius;
    }

    public Deep getDeep() {
        return deep;
    }

    public void setDeep(Deep deep) {
        this.deep = deep;
    }

}
