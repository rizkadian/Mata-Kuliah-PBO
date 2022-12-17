public class Keyboard extends Alat_musik{
    String[] merek_keyboard = {"Yamaha", "Samson"};
    public final void view_data(){
        System.out.println("-----------------------------------------------------");
        System.out.println(" 21              Keyboard                  55.000");
        System.out.println(" Merek keyboard : " + merek_keyboard[0]);
        System.out.println("-----------------------------------------------------");
        System.out.println(" 22              Keyboard                  60.000");
        System.out.println(" Merek keyboard : " + merek_keyboard[1]);
    }
    public String note(){
        return " - Alat musik keyboard";
    }
}
