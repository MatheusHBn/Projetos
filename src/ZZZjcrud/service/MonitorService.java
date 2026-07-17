package ZZZjcrud.service;

import ZZZjcrud.dominio.Monitor;
import ZZZjcrud.dominio.Producer;
import ZZZjcrud.repository.MonitorRepository;

import java.util.Optional;
import java.util.Scanner;

public class MonitorService {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void menu(int op){
        switch (op){
            case 1 -> find();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
        }
    }

    private static void find(){
        System.out.println("Names of the monitors");
        String name = SCANNER.nextLine();
        MonitorRepository.findByName(name);

    }

    private static void delete(){
        System.out.println("Type one of the ids below to delete");
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("Y".equalsIgnoreCase(choice)){
            MonitorRepository.delete(id);
        }
        if ("N".equalsIgnoreCase(choice)){
            System.out.println("Ok, try again");
            throw new IllegalArgumentException("Try again");
        }
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Monitor> monitorOptional = MonitorRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (monitorOptional.isEmpty()) {
            throw new IllegalArgumentException("Monitor not found");
        }
        Monitor monitorFromDB = monitorOptional.get();
        System.out.println("Monitor found!" + monitorFromDB);
        System.out.println("Type de new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? monitorFromDB.getName() : name;

        System.out.println("Type de new number of hertz");
        int hz = Integer.parseInt(SCANNER.nextLine());

        Monitor monitorToUpdate = Monitor.builder().id(monitorFromDB.getId()).hz(hz).producer(monitorFromDB.getProducer()).name(name).build();
        MonitorRepository.update(monitorToUpdate);
    }
    private static void save() {
        System.out.println("Type the name of the monitor");
        String name = SCANNER.nextLine();
        System.out.println("Type the hertz's monitor");
        int hz = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Type the id of the producer");
        int producerId = Integer.parseInt(SCANNER.nextLine());
        Monitor monitor = Monitor.builder().hz(hz).name(name).producer(Producer.builder().id(producerId).build()).build();
        if (name.isEmpty() || isInteger(name)) {
            System.out.println("Don't save any name empty or numbers");
            throw new IllegalArgumentException();
        }
        MonitorRepository.save(monitor);
    }

    public static boolean isInteger(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
