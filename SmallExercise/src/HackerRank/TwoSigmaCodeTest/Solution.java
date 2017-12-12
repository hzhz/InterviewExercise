package HackerRank.TwoSigmaCodeTest;

import java.io.*;
import java.util.*;

public class Solution {
  /*  *//*
 * Complete the function below.
 *//*

    static int friendCircles(String[] friends) {


        List<List<Integer>> cCircle=new ArrayList<List<Integer>>();
        for (int i=0; i<friends.length; i++){
            char[] row= friends[i].toCharArray();
            List<Integer> tCircle=new ArrayList<>();

            for (int j=0; i<row.length;j++){
                if((i!=j && row[j]=='Y') && tCircle.contains(i)) {
                    tCircle.add(j);
                    System.out.println(row[j]);
                }
            }
            cCircle.add(new ArrayList());
        }

        return 0;

    }*/

    /**
     * friendCircles do a char matrix traversal
     * it stores the friends that were assigned a friend group (since they cannot be in >1 friend group) in memory
     * in the traversal, skip friends on the axis that have already been assigned a friend group.
     * update  mark the friend assigned, and call the recursive method updateInPlace
     * then increases the number of circle friends each iteration bc the UpdateInPlace method terminated
     * @param friends
     * @return
     */
    static int friendCircles(String[] friends) {
        char[][] matrix = stringArrayToMatrix(friends);
        int n = matrix.length;

        if (n == 1) return 1;

        boolean[] assigned = new boolean[n];
        for (int i = 0; i < n; i++) assigned[i] = false;

        int circles = 0;
        for (int i = 0; i < n; i++) {
            if (assigned[i]) continue;
            assigned[i] = true;
            updateInPlace(matrix, assigned, i);
            circles++;
        }
        return circles;
    }


    /**
     * updateInPlace is a recursive helper function for friendsCircles,
     * this as a traversal of columns,  skip j already assigned to friends circle or when i=j (ith student=jth student)
     * check friendship. if they are friends, mark the new friend as assigned, and traverse their friends.
     * updates the assigned friends, should not modify matrix. do the recursive call on each new found friend.
     * @param matrix
     * @param assigned
     * @param i
     */
    private static void updateInPlace(char[][] matrix, boolean[] assigned, int i) {
        for (int j = 0; j < matrix.length; j++) {
            if (assigned[j] || i==j) continue;

            if (matrix[i][j] == 'Y') {
                assigned[j] = true;
                updateInPlace(matrix, assigned, j);
            }
        }
    }

    /**
     * stringArrayToMatrix convert string[] to char[][]
     * @param a
     * @return
     */
    private static char[][] stringArrayToMatrix(String[] a) {
        int n = a.length;
        char[][] r = new char[n][n];
        for (int i = 0; i < n; i++) {
            r[i] = a[i].toCharArray();
        }
        return r;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;

        int _friends_size = 0;
        _friends_size = Integer.parseInt(in.nextLine().trim());
        String[] _friends = new String[_friends_size];
        String _friends_item;
        for(int _friends_i = 0; _friends_i < _friends_size; _friends_i++) {
            try {
                _friends_item = in.nextLine();
            } catch (Exception e) {
                _friends_item = null;
            }
            _friends[_friends_i] = _friends_item;
        }

        res = friendCircles(_friends);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}