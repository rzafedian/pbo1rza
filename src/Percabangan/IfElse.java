package Percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalbelanja = 53000;
        double uangdidompet = 25000;

        if(uangdidompet<totalbelanja) {
            System.out.println("DUIT KADA CUKUP");
        }else if(uangdidompet>totalbelanja){
            double angsul = uangdidompet-totalbelanja;
            System.out.println("DUIT CUKUP, ANGSUL : "+angsul);
        } else {
            System.out.println("DUIT PAS KADA BAANGSUL");
        }
    }
}
