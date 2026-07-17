package ZZZjcrud.test;

import ZZZjcrud.service.MonitorService;
import ZZZjcrud.service.ProducerService;

import java.util.Scanner;

public class CrudTest01 {
    private static final Scanner SCANNER = new Scanner(System.in);
    static void main() {

        int op;
        while (true){
            menu();
            op = Integer.parseInt(SCANNER.nextLine());
            if (op == 0) break;
            switch (op){
                case 1 -> {
                    produceMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    ProducerService.menu(op);
                }
                case 2 -> {
                    MonitorMenu();
                    op = Integer.parseInt(SCANNER.nextLine());
                    MonitorService.menu(op);
                }
            }
        }
    }

    private static void produceMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("2. Delete producer");
        System.out.println("3. Save producer");
        System.out.println("4. Update producer");
        System.out.println("9. Go back");
    }

    private static void menu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Producer");
        System.out.println("2. Monitor");
        System.out.println("0. Exit");
    }

    private static void MonitorMenu(){
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for monitor");
        System.out.println("2. Delete monitor");
        System.out.println("3. Save monitor");
        System.out.println("4. Update monitor");
        System.out.println("9. Go back");
    }
}
