package edu.csupomona.cs480.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import edu.csupomona.cs480.App;
import edu.csupomona.cs480.data.provider.PriceGrabber;



/**
 * This is the controller used by Spring framework.
 * <p>
 * The basic function of this controller is to map
 * each HTTP API Path to the correspondent method.
 *
 */

@RestController
public class WebController {

	/**
	 * When the class instance is annotated with
	 * {@link Autowired}, it will be looking for the actual
	 * instance from the defined beans.
	 * <p>
	 * In our project, all the beans are defined in
	 * the {@link App} class.
	 */
    @Autowired

    //private MovieManager movieMananger = new LocalMovieManager();
    /**
     * This is a simple example of how the HTTP API works.
     * It returns a String "OK" in the HTTP response.
     * To try it, run the web application locally,
     * in your web browser, type the link:
     * 	http://localhost:8080/cs480/ping
     */
    @RequestMapping(value = "/cs480/ping", method = RequestMethod.GET)
    String healthCheck() {
    	// You can replace this with other string,
    	// and run the application locally to check your changes
    	// with the URL: http://localhost:8080/
        System.out.println("Health check: OK");
        return "OK";
    }

    /**
     * This is a simple example of how to use a data manager
     * to retrieve the data and return it as an HTTP response.
     * <p>
     * Note, when it returns from the Spring, it will be
     * automatically converted to JSON format.
     * <p>
     * Try it in your web browser:
     * 	http://localhost:8080/cs480/user/user101
     */
    

    
    @RequestMapping(value = "/msprices", method = RequestMethod.GET)
    ModelAndView getBookmarkPage() throws JSONException, IOException {
        //DataManager dm = new DataManager();
    	ArrayList<ArrayList<String>> prices = new ArrayList<ArrayList<String>>();
    	PriceGrabber pg = new PriceGrabber();
    	prices = pg.getPrices();
        
        ModelAndView modelAndView = new ModelAndView("prices");
        modelAndView.addObject("timestamp", prices.get(0));
        modelAndView.addObject("EMPWarriorCape", prices.get(1));
        modelAndView.addObject("EMPMageCape", prices.get(2));
        modelAndView.addObject("EMPBowmanCape", prices.get(3));
        modelAndView.addObject("EMPThiefCape", prices.get(4));
        modelAndView.addObject("EMPPirateCape", prices.get(5));
        
        modelAndView.addObject("EMPWarriorHelm", prices.get(6));
        modelAndView.addObject("EMPMageHelm", prices.get(7));
        modelAndView.addObject("EMPBowmanHelm", prices.get(8));
        modelAndView.addObject("EMPThiefHelm", prices.get(9));
        modelAndView.addObject("EMPPirateHelm", prices.get(10));
        
        modelAndView.addObject("EMPWarriorSuit", prices.get(11));
        modelAndView.addObject("EMPMageSuit", prices.get(12));
        modelAndView.addObject("EMPBowmanSuit", prices.get(13));
        modelAndView.addObject("EMPThiefSuit", prices.get(14));
        modelAndView.addObject("EMPPirateSuit", prices.get(15));
        
        modelAndView.addObject("EMPWarriorGloves", prices.get(16));
        modelAndView.addObject("EMPMageGloves", prices.get(17));
        modelAndView.addObject("EMPBowmanGloves", prices.get(18));
        modelAndView.addObject("EMPThiefGloves", prices.get(19));
        modelAndView.addObject("EMPPirateGloves", prices.get(20));
        
        modelAndView.addObject("EMPWarriorShoes", prices.get(21));
        modelAndView.addObject("EMPMageShoes", prices.get(22));
        modelAndView.addObject("EMPBowmanShoes", prices.get(23));
        modelAndView.addObject("EMPThiefShoes", prices.get(24));
        modelAndView.addObject("EMPPirateShoes", prices.get(25));
        
        modelAndView.addObject("EMPWarriorShoulder", prices.get(26));
        modelAndView.addObject("EMPMageShoulder", prices.get(27));
        modelAndView.addObject("EMPBowmanShoulder", prices.get(28));
        modelAndView.addObject("EMPThiefShoulder", prices.get(29));
        modelAndView.addObject("EMPPirateShoulder", prices.get(30));
        
        return modelAndView;
    }


}