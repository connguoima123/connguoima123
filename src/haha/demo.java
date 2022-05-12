package haha;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		 int sum = 0;
		 int luong;
		 String ten;
		 int ty = 1000000000;
		
		
       for(int i = 0 ;i <= 1000 ; i++) {
    	  if(sum <= ty) {
    	   Scanner sc = new Scanner(System.in);
    	   System.out.println("nhập tên : ");
    	   ten = sc.next();
    	   System.out.println("nhập lương : ");
    	   luong = sc.nextInt();
    	   sum += luong;
    	   if(sum <= ty) {
    	   System.out.println("tên :  " + ten);
    	   System.out.println("lương :  " + luong);
    	   System.out.println("số  nhân viên đã tuyển : " + i);
    	   System.out.println("quỹ trả lương nhân viên còn : " + (ty - luong));
    	   }
    	   
    	  }
    	  else {
    		   System.out.println("chúng tôi đã hết tiền");
    		   break;
    		   
    	   }
    	   
    	   
    	   
       }
       
    }

}
