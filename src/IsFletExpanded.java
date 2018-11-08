public class IsFletExpanded {

    public static boolean isAFlet(char[] X, char[] Y, char[] Z) { //Checks if you can create Z by merging the words X and Y

        int n = Y.length;
        int m = X.length;
        boolean F[][] = new boolean[m+1][n+1];

        String Arrows[][] = new String[m+1][n+1];

        F[0][0] = true; //Two empty strings are equal
        for(int j = 0; j < n; j++) {
            for(int i = 0; i < m; i++)  {
                if (j > 0 && F[i][j-1] == true){ //Scenarie 1 - cellen over er sand
                    if (Z[j+i] == Y[j]) {
                        F[i][j] = true;
                        Arrows[i][j] = "Højre";
                    }
                }
                if (i > 0 && F[i-1][j] == true) { //Scenarie 2 - cellen til venstre er sand
                    if (Z[j+i] == X[i]) {
                        F[i][j] = true;
                        Arrows[i][j] = "Venstre";
                    }
                }
                System.out.print("(");
                System.out.print(F[i][j]);
                System.out.print(")");
            }
            System.out.println();

        }

        for(int j = 0; j < n; j++) {
            for(int i = 0; i < m; i++)  {

                if(Arrows[i][j] == "Venstre") {
                    System.out.println(i+j);
                }
            }

        }


        return F[m-1][n-1];
    }
}
