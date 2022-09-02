package time;

public class TimeTeste {

    public static void main(String[] args) {
        Time time = new Time(12, 2, 5);

        System.out.println(time.exibirHoraPadrao());
        System.out.println(time.exibirHoraUniversal());

        time.setHora(1);
        System.out.println(time.exibirHoraPadrao());
        System.out.println(time.exibirHoraUniversal());
    }


}
