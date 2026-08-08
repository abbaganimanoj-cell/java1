class min {
    public static void main(String[]  args) {
        int[]  arr ={1,2,3,4,5,6,7};
        int min = Integer.MAX_VALUE;
        int SecondMin = Integer.MAX_VALUE;
        int thirdmid = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i] < min) {
                thirdmid = SecondMin;
                SecondMin = min;
                min = arr[i];
            }
            else if (arr[i] < SecondMin && arr[i] != min)
            {
                thirdmid = SecondMin;
                SecondMin = arr[i];
            }
            else if(arr[i] < thirdmid && arr[i] != SecondMin) {
                  thirdmid = arr[i];
            }
        }
        System.out.println("min:"+ min);
        System.out.println("secondMin:"+ SecondMin);
        System.out.println("thirdmin:"+  thirdmid);
    }
}