class search {
    public static void main(String[] args) {
        int [] arr ={1,2,3};
        int key = 2;
        boolean found = true;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]==key) {
                 found = true;
                 break;
            }
        }
        if(found) {
            System.out.println("element found ");

        }
        else {
            System.out.println("not found ");
        }

    }
}