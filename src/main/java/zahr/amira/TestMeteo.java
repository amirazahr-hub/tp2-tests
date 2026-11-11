package zahr.amira;

import zahr.amira.outil.meteo.MeteoTool;

public class TestMeteo {
    public static void main(String[] args) {
        MeteoTool outil = new MeteoTool();
        // Paris : latitude 48.85, longitude 2.35 ; période de 3 jours à partir d'aujourd'hui
        boolean pluie = outil.isPluiePrevue(48.85, 2.35, 0, 3);
        System.out.println("Pluie prévue à Paris pendant les 3 prochains jours : " + pluie);
    }
}