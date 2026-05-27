package ZZDoptional.Repositorio;

import ZZDoptional.dominio.PlacaDeVideo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class GPUsRepository {
    private static List<PlacaDeVideo> placaDeVideos = new ArrayList<>(List.of(
            new PlacaDeVideo("Nvidia" , 1, "3060TI"),
            new PlacaDeVideo("Nvidia", 2 , "1660 Super"),
            new PlacaDeVideo("AMD", 3 , "7700XT")));

    public static Optional<PlacaDeVideo> findById(Integer id){
        return findBy(placaDeVideo -> placaDeVideo.getId().equals(id));
    }

    public static Optional<PlacaDeVideo> findByModel(String model){
        return findBy(placaDeVideo -> placaDeVideo.getModel().equals(model));
    }

    public static Optional<PlacaDeVideo> findBy(Predicate<PlacaDeVideo> predicate){
        PlacaDeVideo found = null;
        for (PlacaDeVideo placaDeVideo : placaDeVideos){
            if (predicate.test(placaDeVideo)){
                found = placaDeVideo;
            }
        }
        return Optional.ofNullable(found);
    }
}
