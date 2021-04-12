class MatrixAdditionandMultiplication
{  
    public static void main(String args[])
    {  
        
         int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
        int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
        
        int c[][]=new int[3][3];  //3 rows and 3 columns
        int d[][]=new int[3][3];  //3 rows and 3 columns
        
     
        for(int i=0;i<3;i++)
        {    
            for(int j=0;j<3;j++)
         {    
            c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
            d[i][j]=0;
            for(int k=0;k<3;k++)
            {
                d[i][j]+=a[i][k]*b[k][j];
            }
                     
            }      
                
        }  
            System.out.println("The Addition of Matrix is");
                for(int i=0;i<3;i++)
            {    
                for(int j=0;j<3;j++)
              {
                System.out.print(c[i][j]+" ");
              }
                System.out.println();
            } 
            System.out.println("The Multiplication of Matrix is");
            for(int i=0;i<3;i++)
        {    
            for(int j=0;j<3;j++)
          {
            System.out.print(d[i][j]+" ");
          }
            System.out.println();
        } 

            



    }
}  