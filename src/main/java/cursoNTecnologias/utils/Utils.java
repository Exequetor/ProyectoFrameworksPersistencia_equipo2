package cursoNTecnologias.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	public static synchronized Date parseStringToDate (String in) {
		// 06/11/2019 21:57:37
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = null;
		try
		{
		   date = formatter.parse(in);
		}
		catch (Exception e)
		{
		   System.out.println("Error en Utils->parseStringToDate");
		   e.printStackTrace();
		}
		return date;
	}
	
	public static synchronized String parseDateToString (Date in) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return formatter.format(in);
	}
}
