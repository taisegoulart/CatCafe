package dev.ifrs;
//Copiado do Smallrye circuit breaker --> isso vai ser reposto pelo banco, não?
/* 
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CoffeeRepository {

    private Map<Integer, Coffee> coffeeList = new HashMap<>();

    public CoffeeRepository() {
    /*    coffeeList.put(1, new Coffee(1, "Fernandez Espresso", "Colombia", 23));
        coffeeList.put(2, new Coffee(2, "La Scala Whole Beans", "Bolivia", 18));
        coffeeList.put(3, new Coffee(3, "Dak Lak Filter", "Vietnam", 25));*/  
        //TODO ajeitar isso aqui porque pelo que entendi iria pegar do banco
   /*  }

    public List<Coffee> getAllCoffees() {
        return new ArrayList<>(coffeeList.values());
    }

    public Coffee getCoffeeById(Integer id) {
        return coffeeList.get(id);
    }

    public List<Coffee> getRecommendations(Integer id) {
        if (id == null) {
            return Collections.emptyList();
        }
        return coffeeList.values().stream()
                .filter(coffee -> !id.equals(coffee.id))
                .limit(2)
                .collect(Collectors.toList());
    }
}*/

