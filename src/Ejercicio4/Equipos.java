package Ejercicio4;

public class Equipos {

    //Atributos
    private String nombreEquipo= "";
    private int partidosJugados=0, golesMarcados=0, golesRecibidos=0,puntos=0;

    //constructor por defecto
    public Equipos(){}

    //constructor con parametros
    public Equipos(String nombreEquipo, int partidosJugados, int golesMarcados, int golesRecibidos, int puntos) {
        this.nombreEquipo = nombreEquipo;
        this.partidosJugados = partidosJugados;
        this.golesMarcados = golesMarcados;
        this.golesRecibidos = golesRecibidos;
        this.puntos = puntos;
    }

    //Getter y setter
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }


    //




    public void actualizarGoles(){

    }
}
