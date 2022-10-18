package algorithms.day01;

import java.util.Scanner;

public class WeightedQuickUnionUF {
    private  int id[];
    private  int sz[];
    private  int count;

    public WeightedQuickUnionUF(int[] id,int N){
        count=N;
        this.id=new int[N];
        sz=new int[N];
        for(int i=0;i<id.length;i++)
            this.id[i]=id[i];
        for(int i=0;i<id.length;i++)
            sz[i]=1;
    }

    public int find(int p){
        while(p!=id[p])
            p=id[p];
        count--;
        return p;
    }

    public int getCount(){
        return count;
    }

    public void union(int p, int q){
        int floorA=find(p);
        int floorB=find(q);

        if (floorA==floorB)
            return ;
        if(sz[floorA]>sz[floorB]) {
            id[floorB] = floorA;
            sz[floorA]+=sz[floorB];
        }else{
            id[floorA] = floorB;
            sz[floorB]+=sz[floorA];
        }
        count--;
    }

    public boolean conntect(int p,int q){
        return find(p)==find(q);
    }
}
