package Ejercicio4;

public class Liga {

    Equipos[] equipo;

    Equipos[] clasificacion;

    public Liga() {
        equipo = new Equipos[]{
                new Equipos(Equipo.RECRE, 0, 0, 0, 0),
                new Equipos(Equipo.BETIS, 0, 0, 0, 0),
                new Equipos(Equipo.SEVILLA, 0, 0, 0, 0),
                new Equipos(Equipo.CADIZ, 0, 0, 0, 0),
                new Equipos(Equipo.MALAGA, 0, 0, 0, 0),
                new Equipos(Equipo.VILLAREAL, 0, 0, 0, 0),
                new Equipos(Equipo.MADRID, 0, 0, 0, 0),
                new Equipos(Equipo.BARCELONA, 0, 0, 0, 0)};
        clasificacion = new Equipos[equipo.length];

        for (int i=0; i< equipo.length;i++){
            clasificacion[i]=equipo[i];
            
        }
    }



   /* public void actualizarGoles(){
        Equipo [] partidos = new Equipo[12];
        while (Equipo.values()!=Equipo.values()){
            for (int i=0; i< partidos.length; i++){

            }
        }
    }*/


    }
