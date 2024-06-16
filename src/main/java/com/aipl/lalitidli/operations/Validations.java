package com.aipl.lalitidli.operations;

public interface Validations {

    public abstract boolean validateDimensions();

    public abstract boolean validateTrayDeepSurface(double deepRadius, double trayRadius, int deepCount);

}
