package Day08;

import java.util.Scanner;
import java.util.Date;

public class Board {

	
	//1.field
		//1.number
		//2.title
		//3.content
		//4.writer
		//5.date
		//6.hits
	
	
	//2.constructor
		//1.empty one
		//2. constructor of all field
		//3. etc
	
	//3.method
		//1.writing
		//2.list
		//3.edit
		//4.delete
		//5.hits rising
		//6.detail
	
	static Scanner scanner=new Scanner(System.in);	
	String posts[];

	
	int bnum;
	String btitle;
	String bcontent;
	String bwriter;
	String bdate;
	int bhits;
	//declare field
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int bnum, String btitle, String bcontent, String bwriter, String bdate, int bhits) {
		super();
		this.bnum = bnum;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bhits = bhits;
	}
	
	public static void start() {
		
		Board board=new Board();//empty object;
		
		
		while(true) {
			System.out.println("[[[Community]]]");
			board.blist();
			System.out.println("0.write");
			int ch=scanner.nextInt();
			if (ch==0)
				board.bwrite();
			if(ch==1) {
				int ch2=scanner.nextInt();
				System.out.println("[[input the number of post");
				board.bview(ch2);
			}
		}
	
	}
	
	
	public void bwrite() {
		System.out.println("[[Writing Page]]");
		
		System.out.println("input title");
		String btitle=scanner.nextLine();
		System.out.println("input contents");
		String bcontent=scanner.nextLine();
		System.out.println("Input writer");
		String bwriter=scanner.nextLine();
		
		int bnum=-1;
		for(int i=0;i<Day08.Day08_2_Start.boardlist.length;i++) {
			if(Day08_2_Start.boardlist[i]==null) {
				if(i==0) {
					bnum=1;
					break;
				}
				else {
					bnum=Day08_2_Start.boardlist[i-1].bnum+1;
					break;
				}
			}
		}
		
		//String bdate="2021-07-26";
		Date date = new Date();
		String bdate=date.toString();
		int bhits=1;
		Board board=new Board(bnum,btitle,bcontent,bwriter,bdate,bhits);
		Day08_2_Start.boardlist[0]=board;
		
				
	}
	public void blist() {
		
		if(Day08_2_Start.boardlist[0]==null)
			return;
		System.out.println("[[Community]]");
		System.out.println("\tNumber\tTitle\tPoster\tHits\tDate");
		System.out.print(Day08_2_Start.boardlist[0].bnum+"\t");
		System.out.print(Day08_2_Start.boardlist[0].btitle+"\t");
		System.out.print(Day08_2_Start.boardlist[0].bwriter+"\t");
		System.out.print(Day08_2_Start.boardlist[0].bhits+"\t");
		System.out.print(Day08_2_Start.boardlist[0].bdate+"\t");




	}
	public void bupdate(int bnum) {
		System.out.println("Revising page");
		
		int index=findboard(bnum);
		if(index==-1)
			return;
		
		
		System.out.println("input Title");
		Day08_2_Start.boardlist[index].btitle=scanner.nextLine();
		System.out.println("input Contents");
		Day08_2_Start.boardlist[index].bcontent=scanner.nextLine();
		
		System.out.println("Rivising has done");
		
	}
	
	
	public void bdelete(int a) {
		System.out.println("The post has been deleted!");
		
		int index=findboard(bnum);
		if(index==-1)
			return;
		
		
		Day08_2_Start.boardlist[index]=null;
		for(int j=index;j<Day08_2_Start.boardlist.length;j++) {
			if(Day08_2_Start.boardlist[j+1]!=null) {
				Day08_2_Start.boardlist[j]=Day08_2_Start.boardlist[j+1];
			}
			else {
				Day08_2_Start.boardlist[j]=null;
				break;
			}
					
		}
	}
			
		
	
	public void bcount() {
		this.bhits++;
	}
	public void bview(int a) {
		
		int index=findboard(bnum);
		if(index==-1)
			return;
		Board board = Day08_2_Start.boardlist[index];
		board.bcount();
		
		
			
			System.out.println("Detail of Post");
			System.out.printf("Title: %s\n",board.btitle);
			System.out.printf("Poster: %s  hits: %d  Date: %s\n",board.bwriter,board.bhits,board.bdate);
			System.out.printf("Content : %s\n",board.bcontent);
			System.out.println("1. revise 2. delete 3. reply 4. go back");
			int ch=scanner.nextInt();
			
			if(ch==1) {}
			if(ch==2) {
				bdelete(bnum);
				return;
			}
			if(ch==3) {}
			if(ch==4) {
				return;
			}
				
			
			
					
	}
	

	
	public int findboard(int bnum) {
		for(int i=0;i<Day08_2_Start.boardlist.length;i++) {
			if(Day08_2_Start.boardlist[i]!=null&&Day08_2_Start.boardlist[i].bnum==bnum) {
				return i;				
			}
			
		}
		System.out.println("Warning! Can not find the post!");
		return -1;
			
	}
	
	
	
	
}
