package org.example;
import java.util.*;

public class setMatZero {

    public void setZeroes(int[][] matrix) {
        Set<Integer> row_set = new HashSet<>();
        Set<Integer> col_set = new HashSet<>();
        int m=matrix.length,n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row_set.add(i);
                    col_set.add(j);
                }
            }
        }

        for(int r:row_set){
            for(int j=0;j<n;j++){
                matrix[r][j]=0;
            }
        }
        for(int c:col_set){
            for(int i=0;i<m;i++){
                matrix[i][c]=0;
            }
        }

    }

}
