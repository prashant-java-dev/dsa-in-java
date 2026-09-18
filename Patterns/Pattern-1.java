package Patterns;
class Pattern_1 {
    public static void pattern1(int n){
    //outter loop
    for (int i=0; i<n;i++){
       for (int j=0;j<n;j++){
           System.out.print("*");
       }
        System.out.println();
    }
    return;
}
}