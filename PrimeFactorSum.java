import java.util.*;

//factors sum of a number
public class Main
{
    public static int calculate(int n,int prime,int k,boolean flag){
        if(n<=prime)return n;
        if(n%prime==0)return prime+calculate(n/prime,prime,k,flag);
        if(prime==2)prime=3;
        else{
            if(flag==false){
                prime = 6*k-1;
            }
            else{
                prime = 6*k+1;
                k++;
            }
            flag = !flag;
        }
        return calculate(n,prime,k,flag);
    }
    public static int find(int n){
        return calculate(n,2,1,false);
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(find(n));
	}
}
