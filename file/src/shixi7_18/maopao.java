package shixi7_18;

public class maopao {
    public static void main(String[] args) {
        int arr []={7,2,3,4};
        int temp;
        int x=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    x++;
                    System.out.print("第"+x+"次交换"+":\t");
                    for (int z=0;z<arr.length;z++){
                        System.out.print(arr[z]+" ");

                    }
                    System.out.println();
                }

                else{
                    x++;
                    System.out.println("第"+x+"次不用交换");
                }


            }

        }
    }
}
