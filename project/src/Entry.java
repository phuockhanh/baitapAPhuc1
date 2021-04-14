import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        char s;
        do{
            System.out.println("Ngan hang ABC xin kinh chao quy khach hang Nguyen Van A ");
            System.out.println("Menu: ");
            System.out.println("1.Nhan phim A de kiem tra tai khoan");
            System.out.println("2.Nhan phim D de nap tien");
            System.out.println("3.Nhan phim W de rut tien");
            System.out.println("4.Nhan phim H de xem lich su 3 lan ");
            System.out.println("5.Nhan phim X de thoat");
            s = sc.next().charAt(0);
            switch (s) {
                case 'A': {
                    atm.check();
                    break;
                }
                case 'D': {
                    System.out.println("Nhap so tien muon gui: ");
                    double mount = sc.nextDouble();
                    atm.deposit(mount);
                    break;
                }
                case 'W': {
                    System.out.println("Nhap so tien muon rut: ");
                    double tienrut = sc.nextDouble();
                    atm.ruttien(tienrut);
                    break;
                }
                case 'H': {
                    atm.lichsu();
                    break;
                }
            }
        }while (s!='X');
    }
}
