/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] nums=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[i][j]=-1;
            }
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        
        int top=0;
        int bottom=m-1;
        
        int left=0;
        int right=n-1;
        int k=0;
        while(k<list.size() && top<=bottom && left<=right){
            for(int i=left;i<=right && k<list.size();i++){
                nums[top][i]=list.get(k);
                k++;
                
            }
            top++;
            for(int i=top;i<=bottom && k<list.size();i++){
                nums[i][right]=list.get(k);
                k++;
            }
            right--;
            
            if(top<=bottom){
                for(int i=right;i>=left && k<list.size();i--){
                    nums[bottom][i]=list.get(k);
                    k++;
                }
                bottom--;
                
            }
            
            if(left<=right){
                for(int i=bottom;i>=top && k<list.size();i--){
                    nums[i][left]=list.get(k);
                    k++;
                }
                left++;
            }
        }
        return nums;
    }
}