/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlr;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Matrix.MultiLinear;
import Matrix.Matrix;
import Matrix.NoSquareException;

/**
 *
 * @author MAHE
 */
public class Mlr {

    /**
     * @param args the command line arguments
     * @throws Matrix.NoSquareException
     */
    public static void main(String[] args) throws NoSquareException, SQLException {
        // TODO code application logic here
//        Matrix X = new Matrix(new double[][]{{4,0,1},{7,1,1},{6,1,0},{2,0,0},{3,0,1}});
//Matrix Y = new Matrix(new double[][]{{27},{29},{23},{20},{21}});
//MultiLinear ml = new MultiLinear(X, Y);
//Matrix beta = ml.calculate();




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win-8
 */

          Connection con = null;
   Statement st = null;
   ResultSet rs = null;
   String s;
   
//connect your app to mysql database
  
       //boolean autoReconnect;
        //boolean useSSL = false;
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false","root","suvimal");
      
      // jdbc:mysql://localhost:3306/Peoples?autoReconnect=true&useSSL=false;
       st = con.createStatement();
       s = "select SA,SB,SC,SD from login.demo";
       rs = st.executeQuery(s);
       ResultSetMetaData rsmt = rs.getMetaData();
       Statement stmt1 = con.createStatement();
ResultSet rs1 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM login.demo");
int count = 0;
    while(rs1.next()){
    count = rs1.getInt("total");
    }
    Statement stmt2 = con.createStatement();
    ResultSet rs2 = stmt2.executeQuery("SELECT Disease FROM login.demo");
    
        
      
    String a = "";
    int nCol = rs.getMetaData().getColumnCount();
    double ar[][] = new double[count][nCol];
    //System.out.println(rowNumb);
    List<int[]> table = new ArrayList<>();
while( rs.next()) {
    int[] row = new int[nCol];
    for( int iCol = 1; iCol <= nCol; iCol++ ){
        a = rs.getObject(iCol).toString();
        row[iCol-1] = Integer.parseInt(a);
    }
    table.add( row );
}

int nColy = rs2.getMetaData().getColumnCount();
double ary[][] = new double[count][nColy];

List<int[]> tabley = new ArrayList<>();
while( rs2.next()) {
    int[] rowy = new int[nColy];
    for( int iCol = 1; iCol <= nColy; iCol++ ){
        a = rs2.getObject(iCol).toString();
        rowy[iCol-1] = Integer.parseInt(a);
    }
    tabley.add( rowy );
}

Matrix m = new Matrix(ar);
Matrix m2 = new Matrix(ary);
MultiLinear ml = new MultiLinear(m,m2);
Matrix result = ml.calculate();

    

/*String b ="";
List<int[]> table = new ArrayList<>();
int arr[] = new int[count];
for(int m=1;m<=count;m++)
{
    b = rs2.getObject(m).toString();
    arr[m-1] = Integer.parseInt(b);
}
for(int p = 0;p<count;p++)
    System.out.println(arr[p]);*/

//int i=0;
//int j=0;
//// print result
//for( int[] row: table ){
//    for( int si: row ){
//       ar[i][j]=si;
//       j++;
//    }
//    j=0;
//    i++;
//  
//}

//i=0;
//j=0;
// print result
//for( int[] row: tabley ){
//    for( int si: row ){
//       ary[i][j]=si;
//       j++;
//    }
//    j=0;
//    i++;
//  
//}
//
//
//for(int k=0;k<count;k++)
//    {
//        for(int l=0;l<nCol;l++)
//        {
//            System.out.print(ar[k][l]+" ");
//        }
//        System.out.println();
//    }
//for(int k=0;k<count;k++)
//    {
//        for(int l=0;l<nColy;l++)
//        {
//            System.out.print(ary[k][l]+" ");
//        }
//        System.out.println();
//    }


}
  
}

