import java.util.Scanner;

public class ATM {
    public double mooney = 1200000;
    public double sendMoney;
    public double Withdrawal;
    Scanner sc = new Scanner(System.in);
    String[] str = new String[3];
    public int count =2;
    public ATM(){

    }
    public double getMooney() {
        return mooney;
    }
    public void setMooney(double mooney) {
        this.mooney = mooney;
    }
    public double getSendMoney() {
        return sendMoney;
    }
    public void setSendMoney(double sendMoney) {
        this.sendMoney = sendMoney;
    }
    public double getTienrut() {
        return Withdrawal;
    }
    public void setTienrut(double tienrut) {
        this.Withdrawal = tienrut;
    }
    public void check(){
        System.out.println("So tien cua ban: ");
        System.out.println(this.mooney);
        ttgd();
    }
    public void deposit(double amount){
        this.sendMoney = amount;
        System.out.println("Giao dich thanh cong, ban vua nap so tien:  "+this.sendMoney +"thanh cong" );
        this.mooney += amount;
        System.out.println("So du cua quy khach la : "+this.mooney);
        if(count<0){
            for(int i=str.length-1;i>0;i--){
                str[i] = str[i-1];
            }
            count = 0;
        }
        str[count] = "Nap tien : "+this.sendMoney;
        count--;
        ttgd();
    }
    public void ruttien(double amount){
        this.Withdrawal = amount;
        if(this.Withdrawal>this.mooney){
            System.out.println("Rut tien khong thanh cong");
            System.out.println("So du trong tai khoan la : " +this.mooney);
            System.out.println("Ban ko the rut so tien hon so du tai khoan");
            ttgd();
        }
        else{
            this.mooney -= this.Withdrawal;
            System.out.println("Rut tien thanh cong, ban vua rut so tien: " + this.Withdrawal +" thanh cong");
            System.out.println("So du trong tai khoan la : " +this.mooney);
           if(count<0){
                for(int i=str.length-1;i>0;i--){
                    str[i] = str[i-1];
                }
                count = 0;
            }
            str[count] = "Rut tien : "+this.Withdrawal;
            count--;
            ttgd();
        }
    }
    public void lichsu(){
        for(int i=0;i<str.length;i++){
            if(str[i]!=null){
                System.out.println(str[i]);
            }
        }
        ttgd();
    }
    public void ttgd(){
        System.out.println("Bam nut theo menu de tiep tuc giao dich");
        System.out.println("========================================");
    }
}
