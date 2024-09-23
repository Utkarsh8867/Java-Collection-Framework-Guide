import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * greddy_IndianCoin
 */
public class greddy_IndianCoin {

    public static void main(String[] args) {
        Integer coin []= {1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coin,Comparator.reverseOrder());
        int value = 1059;
        int COuntofCoins=0;
        ArrayList<Integer> ans = new ArrayList<>();
    
        // Arrays.sort(coin,Comparator.reverseOrder());
         

        for(int i=0;i<coin.length;i++){
           if(coin[i]<= value ){
            while(coin[i]<=value){
               COuntofCoins++;
               ans.add(coin[i]);
               value -= coin[i];
            }
        }
        }

        System.out.println("total (min coins used )="+ COuntofCoins);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();

    }
}