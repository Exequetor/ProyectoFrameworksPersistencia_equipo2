package cursoNTecnologias.utils;

import java.util.List;
import java.util.Random;

public class Utils {
	public static <T> T getRandomElement(List<T> list) 
    { 
        return list.get(randi(list.size())); 
    } 
	
	public static int randi (int maxExcluded) {
		Random rand = new Random();
		return rand.nextInt(maxExcluded);
	}
}
