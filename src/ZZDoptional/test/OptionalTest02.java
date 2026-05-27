package ZZDoptional.test;

import ZZDoptional.Repositorio.GPUsRepository;
import ZZDoptional.dominio.PlacaDeVideo;

import java.util.Optional;

public class OptionalTest02 {
    static void main() {
     Optional<PlacaDeVideo> placaDeVideoByModel = GPUsRepository.findByModel("3060TI");
     placaDeVideoByModel.ifPresent(placaDeVideo -> placaDeVideo.setModel("3060"));
     System.out.println(placaDeVideoByModel);

     PlacaDeVideo placaDeVideoById = GPUsRepository.findById(1).orElseThrow(IllegalArgumentException::new);
     System.out.println(placaDeVideoById);

        PlacaDeVideo placaDeVideo = GPUsRepository.findByModel("1660").orElseGet(() -> new PlacaDeVideo("Nvidia", 8, "6610"));
        System.out.println(placaDeVideo);
    }
}
