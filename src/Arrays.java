public class Arrays {
    public static void main(String[] args) {

        //Declaration
        int[] arr;
        //initialization
        arr=new int[3];
        int[] arr1=new int[5];

        int[] arr2={1,2,3,4,50};

        //accessing elements
        System.out.println("first element is "+ arr2[0]);

        //updating
        arr2[0]=10;
        System.out.println("first element is "+ arr2[0]);

        //print using for loop
        for (int i=0; i <arr2.length ;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        //using for each loop
        for (int i: arr2){
            System.out.println(i);
        }

        //q1- find element
        int x=4;
        for (int i : arr2){
            if(i==x){
                System.out.println("found");
            }
        }
        System.out.println("not found");

        //q2- sum of all elements
        int sum=0;
        for (int s: arr2){
            sum+=s;
        }
        System.out.println("sum="+ sum);

        //q3- find max ele
        int res=Integer.MIN_VALUE;
        for(int i: arr2){
            if(i > res){
                res=i;
            }
        }
        System.out.println("max number is "+res);

        //q4-reverse print
        for(int i=arr2.length-1; i>=0;i--){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //2D -arrays
        int [][]nums= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Traversing 2D array
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        //  Jagged array
        int[][] jagged = new int[3][];

        jagged[0] = new int[]{1, 2};
        jagged[1] = new int[]{3, 4, 5};
        jagged[2] = new int[]{6};

        // Traversing jagged array
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

    }
}
