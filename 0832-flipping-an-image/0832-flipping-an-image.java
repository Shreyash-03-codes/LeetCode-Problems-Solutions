class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int i,j;

        for(int[] row:image){

            for(i=0,j=image[0].length-1;i<=j;i++,j--){

                int temp=row[i]^1;
                row[i]=row[j]^1;
                row[j]=temp;

            }
        }

        return image;
        
    }
}