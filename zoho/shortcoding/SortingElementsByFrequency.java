package zoho.shortcoding;

import java.util.*;

public class SortingElementsByFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        HashMap<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<>();
        for(int i:arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
            list.add(i);
        }
        Collections.sort(list,(n1,n2)->{
                int f1=map.get(n1);
                int f2=map.get(n2);
                if(f1!=f2) return f2-f1; //Descending order by frequency
                return n1-n2; //Ascending order by number
    });
//        for(int i:list)

            System.out.println(list);
    }
}
