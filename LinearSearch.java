public class LinearSearch {
    public static int linearS(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60,70,80,90,100};
        int key=70;
        int index=linearS(numbers, key);
        if(index!=-1){
        System.out.println("Key "+key+" is at index "+index);       
    }else{
        System.out.println("Not found");
    }
}
}
