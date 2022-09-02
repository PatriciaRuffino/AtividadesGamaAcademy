package time;

public class Time {
    private int hora;
    private int minutos;
    private int segundos;

    public Time(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Time() {
    }

    public int getHora(int i) {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }


    public String exibirHoraUniversal() {
        return fmtNum(hora) + " : " + fmtNum(minutos) + " : " + fmtNum(segundos);
    }

    public String exibirHoraPadrao() {
        String sufixo;
        String horaPadrao;
        if (hora == 0) {
            horaPadrao = String.valueOf(fmtNum(hora));
            sufixo = "AM";
        } else if (hora == 12) {
            horaPadrao = String.valueOf(fmtNum(hora));
            sufixo = "PM";
        } else if (hora > 0 && hora < 12) {
            horaPadrao = String.valueOf(fmtNum(hora));
            sufixo = "AM";
        } else {
            horaPadrao = String.valueOf(fmtNum(hora));
            sufixo = "PM";
        }
        return horaPadrao + " : "+fmtNum(this.minutos) + " : "+fmtNum(this.segundos)  +" " +sufixo;
    }
    private String fmtNum(int num){
        if(num <10){
            return "0" + num;
        }
        return String.valueOf(num);
    }


}
