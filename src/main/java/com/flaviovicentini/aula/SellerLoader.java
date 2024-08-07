package com.flaviovicentini.aula;

import com.flaviovicentini.aula.domain.model.Seller;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(3)
@Component
public class SellerLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader fr = new FileReader("files/food.txt");
        BufferedReader bf = new BufferedReader(fr);

        String line = bf.readLine();
        String[] fields = null;

        while (line != null) {
            fields = line.split(";");

            Seller seller = new Seller();
            seller.setCpf(fields[0]);
            seller.setEmail(fields[1]);
            seller.setName(fields[2]);

            System.out.println("[SELLER] " + seller);

            line = bf.readLine();
        }

        bf.close();
        fr.close();
    }
}
