package Day07;

import java.util.Scanner;

//import jdk.internal.misc.FileSystemOption; 

public class Day07_03 {
	//members program
	//id pw;
	
	public static void main(String[] args) {
		
		String [][] members=new String[100][2];
		Scanner input=new Scanner(System.in);
		
		while(true) {
			System.out.println("1.Register  2.Login  3. Exit");
			int a=input.nextInt();
			
			
			if(a==1) {
				System.out.println("[[Register]]");
				System.out.println("Input ID");
				String id=input.nextLine();
							
				boolean idcheck=true;
				
				for(int i=0;i<members.length;i++) {
					if(members[i][0]!=null&&members[i][0].equals(id)) {
						System.out.println("This ID already has been registered");
						idcheck=false;
						break;
					}
					
				}
				if(idcheck) {
					for(int i=0;i<members.length;i++) {
						if(members[i][0]==null) {
							members[i][0]=id;
							System.out.println("Input PW");
							String pw=input.nextLine();	
							members[i][1]=pw;	
							System.out.println("Registerd!");
							break;

						}
					}
				}
				
				
			}
			
			else if(a==2) {
				System.out.println("Input id and pw to Login");
				System.out.println("ID : ");
				String id=input.nextLine();
				System.out.println("PW : ");
				String pw=input.nextLine();
				
				boolean logincheck=true;
				
				for(int i=0;i<members.length;i++) {
					if(members[i][0]!=null&&members[i][0].equals(id)&&members[i][1].equals(pw)) {
						System.out.println("Login successful!");
						logincheck=false;
						System.out.printf("Welcome %s!\n",id);
						while(true) {
							System.out.println("Members program");
							System.out.println("[[1.Drop out   2. Change PW  3.Log Out");
							int ch2=input.nextInt();
							
							if(ch2==1) {
								
							}
							else if(ch2==2) {
								System.out.println("Pw change");
								System.out.println("Input new PW");
								String new_pw =input.nextLine();
								members[i][1]=new_pw;
								System.out.println("Change's done. Soon will be Loged out ");
								break;
								
								
							}
							else if(ch2==3) {
								System.out.println("Log Out Successful");
								break;
								
							}
							
						}
					}
					
				}
				
			}
			
			else if(a==3) {
				
			}
			
		}
		
		
		
	}

}
