
class Bit_Manupulation{
    public static void oddorEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
           System.out.println("even number ");
        }else{
            System.out.println("odd number");

        }
    }

    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
        
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
       return n& bitMask;
    }
    
    public static int updateIthBit(int n ,int i,int newBit){
        int BitMask =newBit <<i;
        return n |BitMask;
         
    }
    public static boolean isPowerofTwo(int n){
        return (n&(n-1)) ==0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        // oddorEven(13);
        System.out.println(updateIthBit(10, 1, 1));
        System.out.println(isPowerofTwo(15));
        
    }
}
