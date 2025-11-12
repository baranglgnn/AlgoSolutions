package ittihad;
import java.util.Scanner;
public class Armstrong_numbe {
	public static void main(String[] args) {
       Scanner Kingo = new Scanner(System.in);
       int sayi= Kingo.nextInt();
       int temp= sayi;
       int kat_sayisi_temp=temp;
       int result=0;
       int kat_sayisi=0;
       while(temp>0) 
       {
    	   while(kat_sayisi_temp>0) 
    	   {
    		   kat_sayisi++;
    		   kat_sayisi_temp=kat_sayisi_temp/10;
    	   }
    	   result = KatKingo(temp%10,kat_sayisi)+result;
    	   temp=temp/10;	   
       }
       if(sayi==result) 
       {
    	   System.out.println("Armstrong Kingo");
       }else
    	   System.out.println("Armstrong deðil Kingo");
    }
	public static int KatKingo(int value,int kat_sayisi) 
	{
		int kat=1;
		for(int i=0;i<kat_sayisi;i++) 
		{
			kat = value*kat;
		}
		return kat;
	}}