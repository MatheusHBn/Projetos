package ZZGconcorrencia.test;

import ZZFthreads.dominio.Members;
import ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    /*
    Vendo como as Threads se comportam com os novos metodos
     */
    static void main() {
        Members members = new Members();
        Thread matheus = new Thread(new EmailDeliveryService(members), "Matheus");
        Thread thiago = new Thread(new EmailDeliveryService(members), "Thiago");
        matheus.start();
        thiago.start();

        while(true){
            String email = JOptionPane.showInputDialog("Joining with you email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
