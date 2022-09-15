package com.employeedailyattendance;

import java.util.Scanner;

public class DailyAttendance {

	 public static void main(String[] args) throws LeaveExceedLimitException {
	        Scanner sc = new Scanner(System.in);
	        Salary s = new Salary();
	        int basic=25000;
	        
	        System.out.println("Enter Attendance as per following format P for present,"
	                + " L for leave it will be paid leave, A for absent,"
	                + " N for no information about this day --- for the mention dates in number");
	        int emp_salary=30000;	
		String[] arr = new String[31];
	int P=0;int A=0;int L =0;int N=0;
	//P for Present,A for Absent,L for paid leave,N for no information about the day
	
	for(int i=0;i<31;i++) {
		  System.out.print( "Attendance for "+i);
          arr[i]=sc.next();
          if(arr[i].equals("P")) {
              P++;
              
          }
          else if(arr[i].equals("L")) {
              L++;
              
          }
          else if(arr[i].equals("A")) {
              A++;
              
          }
          else if(arr[i].equals("N")) {
              N++;
              
          }
      }
      
      
      System.out.println("Your total working days are "+P);
      try {
      if(L>2 || N<4) {
          //System.out.println("Your leaves exceed 2");
          s.calculateTotal(basic);
          //throw new LeaveExceedLimitException("LeaveExceedLimitException");
          
      }
      }
      catch(Exception e) {
          System.out.println(e);
      }
      
      try {
          if(L>2) {
              System.out.println("Your leaves exceed 2");
              //s.calculateTotal(basic);
              throw new LeaveExceedLimitException("LeaveExceedLimitException");
          }
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
      
      try {
      if(N>=4) {
          System.out.println("its been "+ N+ " days, with no information");
          System.out.println("Your salary will not be calculated");
          throw new LeaveExceedLimitException("EmployeeAbscondingException");
      }
      
      }
      catch(LeaveExceedLimitException e){
          System.out.println(e.getMessage());
      }
	}
}
      
          
      