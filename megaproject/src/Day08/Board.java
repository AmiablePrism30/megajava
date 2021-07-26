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
	
	Scanner scanner=new Scanner(System.in);	
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
	public void bupdate() {}
	public void bdelete() {}
	public void bcount() {}
	public void bview(int a) {}
	
	
	

}
