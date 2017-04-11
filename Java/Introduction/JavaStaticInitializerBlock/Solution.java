package Introduction.JavaStaticInitializerBlock;

import java.util.*;

public class Solution{

    static Boolean flag = true;
    static int B, H;

    static  {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        in.close();

        if ( B <= 0 || H <= 0) {
            flag = false;
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {System.out.println(e.toString());}
        }else {
            flag = true;
        }

        /**
         * try {
         if (B <= 0 || H <= 0)
         throw new Exception("Breadth and height must be positive");
         } catch (Exception e) {
         System.out.println(e);
         System.exit(0);
         }
         *
         * */
    }

    public static void main(String[] args){
        if(flag){
            int area = B * H;
            System.out.print(area);
        }
    }
}
