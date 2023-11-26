package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;

    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(360);
        float inEur = 140;
        float expectedEur = 2;
        float outEur = Converter.rubleToEuro(inEur);
        float inDlr = 120;
        float expectedDlr = 2;
        float outDlr = Converter.rubleToDollar(inDlr);
        boolean passedEur = expectedEur == outEur;
        boolean passedDlr = expectedDlr == outDlr;
        System.out.println("140 rubles are 2. Test result : " + passedEur);
        System.out.println("120 rubles are 2. Test result : " + passedDlr);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("320 rubles are " + dollar + " dollar.");
    }

}
