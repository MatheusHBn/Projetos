package ZZZjcrud.service;

import ZZZjcrud.dominio.Producer;
import ZZZjcrud.repository.ProducerRepository;

import java.util.Optional;
import java.util.Scanner;

public class ProducerService {
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
        System.out.println("Names of the producers");
        String name = SCANNER.nextLine();
        ProducerRepository.findByName(name)
                .forEach(producer -> System.out.printf("[%d] -- %s%n",producer.getId(), producer.getName()));
    }

    private static void delete(){
        System.out.println("Type one of the ids below to delete");
        find();
        int id = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Are you sure? Y/N");
        String choice = SCANNER.nextLine();
        if ("Y".equalsIgnoreCase(choice)){
            ProducerRepository.delete(id);
        }
        if ("N".equalsIgnoreCase(choice)){
            System.out.println("Ok, try again");
            throw new IllegalArgumentException("Try again");
        }
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            throw new IllegalArgumentException("Producer not found");
        }
        Producer producerFromDB = producerOptional.get();
        System.out.println("Producer found!" + producerFromDB);
        System.out.println("Type de new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDB.getName() : name;
        Producer producerToUpdate = Producer.builder().id(producerFromDB.getId()).name(name).build();
        ProducerRepository.update(producerToUpdate);
    }
    private static void save() {
        System.out.println("Type the name of the producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        if (name.isEmpty() || isInteger(name)) {
            System.out.println("Don't save any name empty or numbers");
            throw new IllegalArgumentException();
        }
        ProducerRepository.save(producer);
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
