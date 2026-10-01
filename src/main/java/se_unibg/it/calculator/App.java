package se.unibg.it.PimaLezione;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {
	
	static final Logger logger = LogManager.getRootLogger(); //dichiaro il mio logger che utilizzerò, questo dopo aver inserito la dipendenza in pom.xml
	
	public static void main(String[] args) {
    	//solo a scopo dimostrativo sostituisci debug e info con error per vedere su terminale il messaggio
    	logger.debug("Sto entrando nel main");
        logger.info("La somma di 3 + 5 è ");
        logger.debug("calcolo la somma");
        logger.info(Calculator.somma(3, 5));
    }
}
