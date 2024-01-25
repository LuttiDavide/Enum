public class Main {
    public static void main(String[] args) {

        Triangolo triangolo = new Triangolo(TipoForma.TRIANGOLO, 10, 5);
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());
        Rettangolo rettangolo = new Rettangolo(TipoForma.RETTANGOLO, 10, 5);
        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
    }
}