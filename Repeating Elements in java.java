import java.util.Scanner;
class Main
{ 
 public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[10000];
        for(int i= 0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            for(int j=i+1;j<n;j++)
            {
                if(temp==arr[j])
                {
                System.out.println("match");
                } 
            }  
        }
        }
}
