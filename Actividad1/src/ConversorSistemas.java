
import javax.swing.JOptionPane;

public class ConversorSistemas {
    
    public static void main(String[] args) {
        String nBinario, nHexa, nOctal, nDecimal, msjFinal;
        int nDecimalAsInt;
        
        nBinario = JOptionPane.showInputDialog(null, "Ingrese un número binario de no más de 16 dígitos", "Conversor de Sistemas",  JOptionPane.QUESTION_MESSAGE);
        
        boolean nBinarioVerified = verificarNumero(nBinario);
        
        if (nBinarioVerified) {
//            While que rellena de 0's el número binario para completar 16 dígitos
//            while (nBinario.length() < 16) {
//                nBinario = "0" + nBinario;
//            }
            nDecimalAsInt = Integer.parseInt(nBinario, 2);
            nDecimal = String.valueOf(nDecimalAsInt);
            nOctal = Integer.toOctalString(nDecimalAsInt);
            nHexa = Integer.toHexString(nDecimalAsInt);

            msjFinal = "Número binario: " + nBinario + "\nNúmero Octal: " + nOctal + "\nNúmero Decimal: " + nDecimal + "\nNúmero Hexadecimal: " + nHexa;
            JOptionPane.showMessageDialog(null, msjFinal, "Conversor de Sistemas", JOptionPane.INFORMATION_MESSAGE);
        } else{
            msjFinal = "El número ingresado es invalido";
            JOptionPane.showMessageDialog(null, msjFinal, "Conversor de Sistemas", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public static boolean verificarNumero(String nBinario){
        boolean nVerified = true;
        
        if(!(nBinario.length() > 16)){
            for (int i = 0; i < nBinario.length(); i++) {
                if (nBinario.charAt(i) != '1' && nBinario.charAt(i) != '0') {
                    nVerified = false;
                }
            }
        } else {
            nVerified = false;
        }
        
        return nVerified;
    }
    
    
    
}
