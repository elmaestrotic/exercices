public class MCDArray {
        // Function to return gcd of a and b
        static int mcd(int a, int b)
        {
            if (a == 0)
                return b;
            return mcd(b % a, a);
        }


        static int hallarMcd(int arr[], int n)
        {
            int result = arr[0];
            for (int element: arr){
                result = mcd(result, element);

                if(result == 1)
                {
                    return 1;
                }
            }

            return result;
        }

        public static void main(String[] args)
        {
            /*int arr[] = new int[10];
            for (int i = 0; i < arr.length ; i++) {
                arr[i]=(int) (int) (Math.random() * 1000) + 7;
                System.out.print(arr[i]+"|");
            }*/
            int arr[] = { 18,24,36 };
            System.out.println();
            int n = arr.length;
            System.out.println(hallarMcd(arr, n));
        }
    }


