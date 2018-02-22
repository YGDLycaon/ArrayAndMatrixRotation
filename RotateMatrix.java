/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotatematrix;

/**
 *
 * @author Lycaon
 */
public class RotateMatrix {

    /**
     * @param args the command line arguments
     */
    
    public static int[] rotateArray(int[] A, int k){
        int rot = 0;
        while (rot < k) {            
            for (int i = A.length-1; i > 0; i--) {
                A[i] = A[i] ^ A[i-1];
                A[i-1] = A[i] ^ A[i-1];
                A[i] = A[i] ^ A[i-1];
            }
            rot++;
        }
        return A;
    }
    
    public static int[][] rotateMat(int[][] A, int k){
        int B[][] = new int[A.length][A.length];
        int n = A.length-1;
        int rotations = 0;
        while (rotations < k) {            
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    B[j][n-i] = A[i][j];
                }
            }
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = B[i][j];
                }
            }
            rotations++;
        }
        
        return B;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A = {0,1,2,3,4};
        int k = 1;
        int[] res = rotateArray(A,k);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
        System.out.println();
        System.out.println();
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] B = rotateMat(mat,k);
       
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
    }
    
}
