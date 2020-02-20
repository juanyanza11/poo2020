package arreglosdeberpoo;

public class Binario {
    private String num = "";
public Binario(String numero){
    num = numero;
}
    public int[] parse(String num){
        int[] nums = new int[num.length()];
        for(int i=0; i<num.length(); i++){
            nums[i] = Character.getNumericValue(num.charAt(i));
        }
        return nums;
    }
}
