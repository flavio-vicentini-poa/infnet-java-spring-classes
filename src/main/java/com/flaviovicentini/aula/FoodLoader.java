package com.flaviovicentini.aula;

import com.flaviovicentini.aula.domain.model.Food;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(1)
@Component
public class FoodLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader fr = new FileReader("files/food.txt");
        BufferedReader bf = new BufferedReader(fr);

        String line = bf.readLine();
        String[] fields = null;

        while (line != null) {
            fields = line.split(";");

            Food food = new Food();
            food.setCode(Integer.parseInt(fields[0]));
            food.setDescription(fields[1]);
            food.setHasInventory(Boolean.parseBoolean(fields[2]));
            food.setPrice(Float.parseFloat(fields[3]));
            food.setTraits(fields[4]);
            food.setOrganic(Boolean.parseBoolean(fields[5]));

            System.out.println("[FOOD] " + food);

            line = bf.readLine();
        }

        bf.close();
        fr.close();
    }
}
