

package eratosthenes;
import java.util.Arrays;
import javax.swing.*;
/**
 * @title Eratosthenes
 * @author Steven Biro
 * @teacher Mr. J. Carron
 * @date 5-Feb-2015 12:26:18 PM
 * @purpose The purpose of this program is to calculate the prime numbers between 0 and 1000
 */
public class Eratosthenes {

    public static void main(String[] args) {
        boolean numbers[] = new boolean[1000];
        String nums = "";
        Arrays.fill(numbers, true);
        numbers[0]=false;
        numbers[1]=false;
        for (int i=2;i<1000;i++) {
                for (int x=3;x<1000;x++) {
                    if (i!=x&&x%i==0){
                        numbers[x]=false;
                    }
            }
            if (numbers[i]==true){
                nums+=i+", ";
            }
        }
    JOptionPane.showMessageDialog(null,"<html><body><p style='width: 200px;'>"+nums.substring(0,(nums.length() -2))+".");
    }

}
