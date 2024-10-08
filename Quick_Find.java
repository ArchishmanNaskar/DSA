package DSA;
import java.util.*;
public class Quick_Find {
    public static int[] id;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        creat_data(i);
        while(true){
            String s= sc.next();
            if(s.equalsIgnoreCase("join")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                join(x,y);
            }
            else if(s.equalsIgnoreCase("inspect")){
                int x=sc.nextInt();
                int y=sc.nextInt();
                System.out.println(inspect(x,y));
            }
            else{
                break;
            }
        }
    }
public static void creat_data(int i){
        id =new int[i];
        for(int j=0;j<i;j++){
            id[j]=j;
        }
}
public static int join(int a,int b){
        if(id[a]==id[b]){
            return 0;
        }
        int[] copy=new int[id.length];
        for(int f=0;f<id.length;f++){
            if(id[f]==id[a]){
                copy[f]=id[b];
            }
            else{
                copy[f]=id[f];
            }
        }
        id=copy;
        return 0;
}
public static boolean inspect(int c,int d){
        return id[c]==id[d];
}
}


