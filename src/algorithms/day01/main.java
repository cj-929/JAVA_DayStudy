package algorithms.day01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入触点数量：");
        int n=Integer.valueOf(sc.nextLine());
        int[] id=new int[n];
        for (int i = 0; i < n; i++) {
            id[i]=i;
        }
        WeightedQuickUnionUF wgquf=new WeightedQuickUnionUF(id,n);
        String s;
        while(!(s=sc.nextLine()).isEmpty()){
            String[] str=s.split(" ");
            int i=Integer.valueOf(str[0]);
            int j=Integer.valueOf(str[1]);
            if(wgquf.conntect(i,j)){
                continue;
            }
            wgquf.union(i,j);
        }
        System.out.println(wgquf.getCount()+" "+"componets");
    }
}
