package Composition;

import java.awt.event.ItemEvent;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SprinklerSystem {
	private String valve1, valve2, valve3, valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	public String toString() {

		return
				"valve1 = " + valve1 + " " +
				"valve2 = " + valve2 + " " +
				"valve3 = " + valve3 + " " +
				"valve4 = " + valve4 + "\n" +
				"i = " + i + " " + "f = " + f + " " +
				"source = " + source;
	}
	public static void main(String[] args) {
		//SprinklerSystem sprinklers = new SprinklerSystem();
		//System.out.println(sprinklers);
		//print
		int p[]= {10, 20, 20, 10, 10, 30, 50, 10, 20,20};
		new SprinklerSystem().data(p);
	}
	public void data(int a[]) {
		Arrays.sort(a);
		int parcount=0,count=0;
		int j=0,k=0;
		for(int data:a)
			System.out.print(data+" ");
		System.out.println(" ");
		while(true){
			if(k==a.length){
				System.out.print(parcount);
				if(parcount%2==0) {
					count=(parcount/2)+count;
					System.out.println(":-> "+(parcount/2));
				}else {
					count=((parcount-1)/2)+count;
					System.out.println(":-> "+((parcount-1)/2));
				}
				parcount=0;
				break;
			}
			else if(a[k]==a[j]){
				parcount+=1;
				j=k;
				k++;
			}
			else {
				System.out.print(parcount);
				if(parcount%2==0) {
					count=(parcount/2)+count;
					System.out.println(":-> "+(parcount/2));
				}else {
					count=((parcount-1)/2)+count;
					System.out.println(":-> "+((parcount-1)/2));
				}
				parcount=0;
				j=k;
			}
		}
		System.out.println("Pair Count "+count);
	}
}