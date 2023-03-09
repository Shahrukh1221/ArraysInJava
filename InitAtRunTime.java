
class InitAtRunTime{
    public static void main(String arr[]){
        int a[][]={
            {3,6},{5,8},{7,5}
        };
        for(int x[] : a){
            for (int value : x){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}