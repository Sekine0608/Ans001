public class Main{

	public static void main(String[] args){
        String target = "281723812895621583571385238123456128123" ;
        
        if(args.length>=1){
            target = args[0] ;
        }
            
		StringBuilder tmp = new StringBuilder(target.substring(0,1));
		String ans = "";
		int maxLength = 0 ;
		char zero = '0' ;	
		for(int i=0 ; i<target.length()-1 ; i++){
			int now = target.charAt(i) - zero;
			int next = target.charAt(i+1) - zero;
			if(now < next){
				tmp.append("" + next) ;
			}else{ 
				if(tmp.length() >= ans.length()){
					ans = tmp.toString() ;	
				}
				tmp.delete(0, tmp.length()) ;
				tmp.append(next + "") ;
			}	
		}
		System.out.println(ans) ;	

	}
}
