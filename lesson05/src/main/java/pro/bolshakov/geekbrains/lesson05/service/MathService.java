package pro.bolshakov.geekbrains.lesson05.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service("mathService")
public class MathService {

    public int randomInt(){
        Random rnd = new Random(System.currentTimeMillis());
        return rnd.nextInt(100_000);
    }

}
