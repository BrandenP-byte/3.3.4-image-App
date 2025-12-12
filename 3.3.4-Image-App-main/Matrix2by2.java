public class Matrix2by2 {
    private double a11, a12;
    private double a21, a22;

    // ----- Constructors -----
    public Matrix2by2() {
        this.a11 = 1; this.a12 = 0;
        this.a21 = 0; this.a22 = 1;
    }

    public Matrix2by2(double a11, double a12, double a21, double a22) {
        this.a11 = a11;
        this.a12 = a12;
        this.a21 = a21;
        this.a22 = a22;
    }

    // ----- Getters (1 pnt) -----
    public double getA11() { return a11; }
    public double getA12() { return a12; }
    public double getA21() { return a21; }
    public double getA22() { return a22; }

    // ----- Setters (1 pnt) -----
    public void setA11(double v) { a11 = v; }
    public void setA12(double v) { a12 = v; }
    public void setA21(double v) { a21 = v; }
    public void setA22(double v) { a22 = v; }

    // setRotationMatrix(angle) — builds a standard 2x2 rotation matrix
    public void setRotationMatrix(double angleDegrees) {
        double theta = Math.toRadians(angleDegrees);
        double cos = Math.cos(theta);
        double sin = Math.sin(theta);

        this.a11 = cos;
        this.a12 = -sin;
        this.a21 = sin;
        this.a22 = cos;
    }

    // ----- Mutators (1 pnt)
    // Scale entries
    public void scale(double s) {
        a11 *= s;
        a12 *= s;
        a21 *= s;
        a22 *= s;
    }

    // Add another matrix to this one
    public void add(Matrix2by2 other) {
        this.a11 += other.a11;
        this.a12 += other.a12;
        this.a21 += other.a21;
        this.a22 += other.a22;
    }

    // ----- Vector multiply (2 pnts) -----
    // Vector is represented as a 1x2: [x, y]
    public double[] multiply(double[] vec) {
        if (vec.length != 2)
            throw new IllegalArgumentException("Vector must be length 2");

        double x = vec[0];
        double y = vec[1];

        double outX = a11 * x + a12 * y;
        double outY = a21 * x + a22 * y;

        return new double[] { outX, outY };
    }

    @Override
    public String toString() {
        return "[" + a11 + ", " + a12 + "]\n[" + a21 + ", " + a22 + "]";
    }
}