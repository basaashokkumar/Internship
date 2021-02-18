public class Jaggedarray {
    public static void main(String[] args) {
        int [][]ab=new int[5][];
        ab[0]=new int[1];
        ab[1]=new int[2];
        ab[2]=new int[3];
        ab[3]=new int[2];
        ab[4]=new int[1];
        for(int i=0;i< ab.length;i++){
            for(int j=0;j<ab[i].length;j++){
                ab[i][j]=-7;
            }
        }
        for(int i=0;i< ab.length;i++){
            for(int j=0;j<ab[i].length;j++){
                System.out.print(ab[i][j]+" ");
            }
            System.out.println();
        }
    }
}
