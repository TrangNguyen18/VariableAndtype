public class App {
    static String global="Global varialble";
    public static void main (String[] args){
 //       String str;
 //       str = "Nguyen Thi Thu Trang";
        String str = "Nguyen Thi Thu Trang";
        System.out.println(str);
        System.out.println(global);
        System.out.println("Name\tDOB");
        int i=10;//-2^31->2^31-1
        short s=10000;//-32768->32767
        long l=100L;// L the hien la so 100 nhung kieu long
        float f = 3.1f;// bat buoc phai co chu f
        double d=5.7;//khong can ghi , doi voi java chi can ghi co dau . duoc hieu la double, co the them d neu muon
        char c='a';// kieu ki tu dung nhay don, string la chuoi ki tu nen can dung nhay doi
        char c2='5';
        char c3=65;// khai bao nhu the nay tuong duong voi ki tu o vi tri 65 theo ma ASII
        boolean b=true;
        boolean b2=false;
        Integer ref_i = 100;
//        int x = 100;
//        int y = 200;
//        System.out.println("X= " + x + ", Y = " + y);
//        swap(x,y);
//        System.out.println("X= " + x + ", Y= " + y);
        int x = 100;
        int y = 200;
        swap(x, y);
        System.out.println("X bang: " + x + ", Y bang: " + y);
        Season se = Season.autum;
        System.out.println(se.getValue());
        SimpleSeason sse = SimpleSeason.Xuan;
        System.out.println("Hien thi mua trong nam: " + sse);
    }
    static  void swap(int x, int y){
   int tmp=x;
        x = 5000;
        y = 2000;
        System.out.println("Swap: X =" + x + ", y = " + y);
    }

}
