package tictactoe;
import java.util.*;
public class game {
	public static boolean set1(char[][] t,char x) {
		int flag=0;
		if(t[0][0]==x) {
			flag++;
		}
		if(t[0][1]==x) {
			flag++;
		}
		if(t[0][2]==x) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean set2(char[][] t,char x) {
		int flag=0;
		if(t[0][0]==x) {
			flag++;
		}
		if(t[1][0]==x) {
			flag++;
		}
		if(t[2][0]==x) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean set3(char[][] t,char x) {
		int flag=0;
		if(t[0][0]==x) {
			flag++;
		}
		if(t[1][1]==x) {
			flag++;
		}
		if(t[2][2]==x) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean set4(char[][] t,char x) {
		int flag=0;
		if(t[0][2]==x) {
			flag++;
		}
		if(t[1][2]==x) {
			flag++;
		}
		if(t[2][2]==x) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean set5(char[][] t,char x) {
		int flag=0;
		if(t[0][2]==x) {
			flag++;
		}
		if(t[1][1]==x) {
			flag++;
		}
		if(t[2][0]==x) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean set6(char[][] t,char x) {
		int flag=0;
		if(t[2][0]==x) {
			flag++;
		}
		if(t[2][1]==x) {
			flag++;
		}
		if(t[2][2]==x) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean set7(char[][] t,char x) {
		int flag=0;
		if(t[0][1]==x) {
			flag++;
		}
		if(t[1][1]==x) {
			flag++;
		}
		if(t[2][1]==x) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean set8(char[][] t,char x) {
		int flag=0;
		if(t[1][0]==x) {
			flag++;
		}
		if(t[1][1]==x) {
			flag++;
		}
		if(t[1][2]==x) {
			flag++;
		}
		if(flag==3) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean check_mtr(char[][] t,char x,int i,int j) {
		int flag=0;
		if(i==0) {
			switch(j) {
			case 0:
				if(set1(t,x)) {
					return true;
				}
				if(set2(t,x)) {
					return true;
				}
				if(set3(t,x)) {
					return true;
				}
				break;
			case 1:
				if(set1(t,x)) {
					return true;
				}
				if(set7(t,x)) {
					return true;
				}
				flag=1;
				break;
			case 2:
				if(set1(t,x)) {
					return true;
				}
				if(set4(t,x)) {
					return true;
				}
				if(set5(t,x)) {
					return true;
				}
				break;
			default :
				return false;
			}
		}
		else if(i==1) {
			switch(j) {
			case 0:
				if(set2(t,x)) {
					return true;
				}
				if(set8(t,x)) {
					return true;
				}
				flag=1;
				break;
			case 1:
				if(set3(t,x)) {
					return true;
				}
				if(set5(t,x)) {
					return true;
				}
				if(set7(t,x)) {
					return true;
				}
				if(set8(t,x)) {
					return true;
				}
				break;
			case 2:
				if(set4(t,x)) {
					return true;
				}
				if(set8(t,x)) {
					return true;
				}
				flag=1;
				break;
			default :
				return false;
			}
		}
		else {
			switch(j) {
			case 0:
				if(set2(t,x)) {
					return true;
				}
				if(set5(t,x)) {
					return true;
				}
				if(set6(t,x)) {
					return true;
				}
				break;
			case 1:
				if(set6(t,x)) {
					return true;
				}
				if(set7(t,x)) {
					return true;
				}
				break;
			case 2:
				if(set3(t,x)) {
					return true;
				}
				if(set4(t,x)) {
					return true;
				}
				if(set6(t,x)) {
					return true;
				}
				break;
			default :
				return false;
			}
		}
		return false;
	}
	public static char[][] assign(char[][] t, char x,int i,int j){
		t[i][j]=x;
		return t;
	}
	public static void display_board(char[][] t) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(j==2) {
					System.out.print(t[i][j]+" ");
				}else {
				System.out.print(t[i][j]+" | ");
				}
			}
			System.out.println();
		}
	}
	public static int find_i(int k) {
		if(k>=1&&k<=3) {
			return 0;
		}
		else if(k>=4&&k<=6) {
			return 1;
		}
		else {
			return 2;
		}
	}
	public static int find_j(int k) {
		if(k>=1&&k<=3) {
			k=k-3;
		}
		else if(k>=4&&k<=6) {
			k=k-6;
		}
		else {
			k=k-9;
		}
			if(k==0) {
				return 2;
			}
			else {
				if(k==-1) {
					return 1;
				}
				else {
					return 0;
				}
			}
		
	}
	public static char[][] initiate(char[][] t){
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				t[i][j]='_';
			}
		}
		return t;
	}
	public static HashMap<Integer,Boolean> initiate_pos_check(HashMap<Integer,Boolean> h) {
		for(int i=1;i<=10;i++) {
			h.put(i, true);
		}
		return h;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int k;
		HashMap<Integer,Boolean> h=new HashMap();
		char[][] t=new char[3][3];
		t=initiate(t);
		h=initiate_pos_check(h);
		System.out.println("TIC-TAC-TOE");
		System.out.println("'X' for Player 1 and 'O' for player 2");
		display_board(t);
		int flag=1,flag_=1,flag_win=0;
		while(flag_<=9) {
			int index_i,index_j,w=1;
			if(flag==1) {
				flag=2;
				System.out.println("Itz Player 1's turn");
				while(true) {
				k=sc.nextInt();
				if(h.get(k)==true) {
					h.put(k,false);
					break;
				}
				else {
					System.out.println("Please Enter the correct position :(");
				}
				}
				index_i=find_i(k);
				index_j=find_j(k);
				t=assign(t,'X',index_i,index_j);
				display_board(t);
				if(check_mtr(t,'X',index_i,index_j)) {
					System.out.println("Player 1 Wins!!!");
					w=2;
				}
				if(w==2) {
					int fl=0;
					while(true) {
					System.out.println("1.New Game\n2.Exit");
					int ch=sc.nextInt();
					switch(ch) {
					case 1:
						flag_=0;
						t=initiate(t);
						h=initiate_pos_check(h);
						display_board(t);
						flag=1;
						fl=0;
						break;
					case 2:
						flag_win=2;
						fl=0;
						break;
					default :
						System.out.println("Please Enter Correct Choice..");
						fl=1;
						
					}
					if(fl!=1) {
						break;
					}
				}
				}
				
			}
			else {
				flag=1;
				System.out.println("Itz Player 2's turn");
				while(true) {
					k=sc.nextInt();
					if(h.get(k)==true) {
						h.put(k,false);
						break;
					}
					else {
						System.out.println("Please Enter the correct position :(");
					}
					}
				index_i=find_i(k);
				index_j=find_j(k);
				t=assign(t,'O',index_i,index_j);
				display_board(t);
				if(check_mtr(t,'O',index_i,index_j)) {
					System.out.println("Player 2 Wins!!!");
					w=2;
				}
				if(w==2) {
					int fl=0;
					while(true) {
					System.out.println("1.New Game\n2.Exit");
					int ch=sc.nextInt();
					switch(ch) {
					case 1:
						flag_=0;
						t=initiate(t);
						h=initiate_pos_check(h);
						display_board(t);
						flag=1;
						fl=0;
						break;
					case 2:
						flag_win=2;
						fl=0;
						break;
					default :
						System.out.println("Please Enter Correct Choice..");
						fl=1;
						
					}
					if(fl!=1) {
						break;
					}
					}
				}
			}
			flag_++;
			if(flag_win==0&&flag_==10) {
				System.out.println("DRAW MATCH :| ");
				break;
			}
			if(flag_win==2) {
				System.out.println("Thank You For Playing TIC-TAC-TOE");
				break;
			}
		}
		
	}
}
