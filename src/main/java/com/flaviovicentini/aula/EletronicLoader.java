package com.flaviovicentini.aula;

import com.flaviovicentini.aula.domain.model.Eletronic;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Order(2)
@Component
public class EletronicLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader fr = new FileReader("files/eletronic.txt");
        BufferedReader bf = new BufferedReader(fr);

        String line = bf.readLine();
        String[] fields = null;

        while (line != null) {
            fields = line.split(";");

            Eletronic eletronic = new Eletronic();
            eletronic.setCode(Integer.parseInt(fields[0]));
            eletronic.setDescription(fields[1]);
            eletronic.setHasInventory(Boolean.parseBoolean(fields[2]));
            eletronic.setPrice(Float.parseFloat(fields[3]));
            eletronic.setBrand(fields[4]);
            eletronic.setWarranty(Integer.parseInt(fields[5]));

            System.out.println("[ELETRONIC] " + eletronic);

            line = bf.readLine();
        }

        bf.close();
        fr.close();
    }
}
