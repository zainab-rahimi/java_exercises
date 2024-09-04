class Main {
    
    static float new_function(float z , int n ){
        return z * z + n;
    }

    // here we define the main method and we call the other
    public static void main (String[] args){
        System.out.println(new_function(2, 10 ));
/* 
        
       int a = 1;
       boolean b ; 
       b = a < 10; 

       int i = 4 ;
        int j = i + 2 * 3;
        int k = 124 % j ;

        System.out.println(" i = "+ i +"\n j = "+ j+ "\n k = "+ k+ "\n value of b is "+ b+" \n and value of a is: "+a);
        int v = 0; 
        v++;
        int amount = v++;
        System.out.println(++v + " "+ amount);
        System.out.println(v);
 
        boolean canITakeherMoney;
        int herBalance = 5;
        long myBalance = 6;
        //herBalance += 8;
        canITakeherMoney = herBalance > myBalance;
        canITakeherMoney = canITakeherMoney && (herBalance >= 3);
        System.out.println(canITakeherMoney);
        */
    }
}
