import java.util.Scanner;
public class Push {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[]mang={1,7,12,8,9,0,0,0,0,0};
        hienthi(mang);
        System.out.println("Nhap so can them : ");
        int so=scanner.nextInt();
        System.out.println("Nhap vi tri can them : ");
        int vt=scanner.nextInt();
        them(mang,so,vt);
        hienthi(mang);
    }
    public static void hienthi(int[]mang){
        System.out.print("mang =");
        for (int i=0 ; i<mang.length ; i++){
            System.out.print(mang[i]+"\t");
        }
    }
    public static void them(int[]mang , int so ,int vt){
        if (vt<=1 || vt>mang.length ){
            System.out.println("khong chen duoc phan tu");
        }else {
            for (int i=mang.length-1; i>vt ; i--){
                mang[i]=mang[i-1];
            }
            mang[vt]=so;
        }
    }
}
