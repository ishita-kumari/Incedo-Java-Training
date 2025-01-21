package day3.C;

public class FindPosition {
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
        for(int i=0;i<args[0].length();i++) {
        	try {
        		int num = Integer.parseInt(args[0].substring(i,i+1));
            	int[] ans = getFirstPosition(num);
            	if(ans[0]==-1 || ans[1]==-1){
            		System.out.println("Given number is not present in matrix");
            	}
            	else{
            		System.out.println("Given number is present at row: "+ans[0]+", col: "+ans[1]);
            	}
        	}
        	catch(NumberFormatException e) {
        		System.err.print(e);
        	}
        }
    }

}
