package day3.D;

public class FindPosition {
	//3ui76789
    private static int matrix[][] = {
            { 1, 7, 3, 9, 5, 3 },
            { 6, 2, 3 },
            { 7, 5, 1, 4, 0 },
            { 1, 0, 2, 9, 6, 3, 7, 8, 4 }
    };
    static int[] getFirstPosition(int num){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(num==matrix[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String args[]) {
    	try {
    		if (args.length < 1) {
    			System.out.println("Please provide a number as a command-line argument.");
    			return ;
    		}
    	}catch(Exception e) {
    		System.out.println("Number of arguments should be atleast 1: "+e);
    	}
    	
		for(int i=0;i<args[0].length();i++) {
			char ch = args[0].charAt(i);
			if(Character.isLetter(ch)) {
				System.out.println("Skipping characters!!!");
				continue;
			}
    		int num = Integer.parseInt(args[0].substring(i,i+1));

    		int[] ans = getFirstPosition(num);
        	if(ans[0]==-1 || ans[1]==-1){
        		System.out.println("Given number is not present in matrix");
        	}
        	else{
        		System.out.println("Given number is present at row: "+ans[0]+", col: "+ans[1]);
        	}
    	}
	}
}
