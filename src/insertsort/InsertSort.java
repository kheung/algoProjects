/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertsort;

/**
 *
 * @author H
 */
public class InsertSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = {7, 4, 8, 2, 5, 3, 9};
        sort(A);
        show(A);  // display the sorted result A
    }
    
    public static void sort(int[] arr)
	{
          
         int j;
                    
              for (int i = 1; i < arr.length; i++ ) {
			int temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j-- ) {
				arr[j + 1] = arr[j];
				arr[j] = temp;
			}
		}
			
            } 
        
        
        public static void show(int[] a)
        {
            for(int i = 0; i<a.length;i++)
            {
                System.out.print(a[i]+", ");
            }
            
            
        }
}
