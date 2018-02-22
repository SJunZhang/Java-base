package thread;

public class BreakTest {
	public static void main(String[] args) {
		breakTest1();
		
		
	}
	
	static void breakTest1(){
		label1:
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(i==3&&j==3){
					break label1;
				}else{
					System.out.println(i+"\t"+j);
				}
			}
		}
		
	}
	
	void continueTest1(){
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==j)
					continue;
				System.out.println(i+"\t"+j);
			}
		}
	}

}
