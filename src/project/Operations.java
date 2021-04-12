package project;

public class Operations implements IFunctions {

    @Override
    public double calculaSoma(double a1, double a2) {
        return a1+a2;
    }

    @Override
    public double calculaSub(double a1, double a2) {
        return a1-a2;
    }

    @Override
    public double calculaSMult(double a1, double a2) {
        return a1*a2;
    }

    @Override
    public double calculaDiv(double a1, double a2) {
        return a1/a2;
    }
}
