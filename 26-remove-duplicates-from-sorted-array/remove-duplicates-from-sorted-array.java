class Solution{

    public int removeDuplicates(int[] nums){
        // if array is empty return 0
        if(nums.length==0) return 0;

        
        int i=0;

        //start from second element
        for(int j=1; j< nums.length; j++){

            //if new unique element is found
            if(nums[j]!= nums[i]){
                //move unique position forward
                i++;
                //place new unique element
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}

public class removeDuplicates{
    public static void main(String[] args){
        int[] nums= {0,0,0,1,1,2,2,2,2,3,3,3,3,4};

        Solution sol= new Solution();
        int k= sol.removeDuplicates(nums);

        System.out.println("Unique count=" + k);
        System.out.print("array after removing duplicatess:");
            for(int x= 0; x< k;x++){  
                System.out.print(nums[x]+  " ");
            }
        }
}