package com.nttdata.mvn;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Divide
 *
 */
public class App 
{
	private static final Logger LOGG = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		int contador = 80000;
		LOGG.info("Inicio del bucle");
		while(contador>0) {
			divide(240000,contador);
			contador--;
			LOGG.info("contador value: {}", contador);
		}
		LOGG.info("Fin del bucle");
	}
	
    /**
     * @param num1, num2 Integer
     * @return Integer
     */
    public static Integer divide(Integer num1, Integer num2) throws ArithmeticException { 
    	if(LOGG.isDebugEnabled()) {
    		LOGG.debug("El dividendo es {}", num2);
    	}
    	
    	return num1/num2;
    }
}
