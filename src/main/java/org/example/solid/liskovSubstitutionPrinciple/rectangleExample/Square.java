package org.example.solid.liskovSubstitutionPrinciple.rectangleExample;

public class Square extends Rectangle {
    double sideA;

    //no sideB, because it is a square and it is concrete rectangle;
    double getArea() {
        return sideA * sideA;
    }
}
