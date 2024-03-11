package com.sanedge.triangle;

class Triangle {
  private final double side1;
  private final double side2;
  private final double side3;

  Triangle(double side1, double side2, double side3) throws TriangleException {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;

    if (!isTriangle()) {
      throw new TriangleException();
    }

  }

  private boolean isTriangle() {
    return areAllSidesGreaterThanZero() && doesTriangleFollowsSumOfSidesProperty();
  }

  private boolean areAllSidesGreaterThanZero() {
    return Double.compare(side1, 0.0) > 0 &&
        Double.compare(side2, 0.0) > 0 &&
        Double.compare(side3, 0.0) > 0;
  }

  private boolean doesTriangleFollowsSumOfSidesProperty() {
    return Double.compare(side1 + side2, side3) > 0 &&
        Double.compare(side2 + side3, side1) > 0 &&
        Double.compare(side3 + side1, side2) > 0;
  }

  boolean isEquilateral() {
    return Double.compare(side1, side2) == 0 &&
        Double.compare(side2, side3) == 0 &&
        Double.compare(side3, side1) == 0;
  }

  boolean isIsosceles() {
    return Double.compare(side1, side2) == 0 ||
        Double.compare(side2, side3) == 0 ||
        Double.compare(side3, side1) == 0;
  }

  boolean isScalene() {
    return Double.compare(side1, side2) != 0 &&
        Double.compare(side2, side3) != 0 &&
        Double.compare(side3, side1) != 0;
  }

}
