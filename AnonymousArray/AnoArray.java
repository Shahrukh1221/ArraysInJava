class Calc{
    public int add(int x[]){
        int sum=0;
        for(int i:x){
            sum+=i;
        }
        return sum;
    } 
}

class AnoArray{
    public static void main(String[] args) {
        Calc obj=new Calc();
        //int x[]={5,4,3,2};
        int res=obj.add(new int[]{5,4,3,2});
        System.out.println(res);
    }
}