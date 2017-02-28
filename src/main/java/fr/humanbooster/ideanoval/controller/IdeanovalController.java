package fr.humanbooster.ideanoval.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.humanbooster.ideanoval.business.Category;
import fr.humanbooster.ideanoval.business.Idea;
import fr.humanbooster.ideanoval.business.Rating;
import fr.humanbooster.ideanoval.business.Survey;
import fr.humanbooster.ideanoval.business.User;
import fr.humanbooster.ideanoval.services.CategoryService;
import fr.humanbooster.ideanoval.services.IdeaService;
import fr.humanbooster.ideanoval.services.SurveyService;
import fr.humanbooster.ideanoval.services.UserService;


@Controller
public class IdeanovalController {
	
	@Autowired
	private HttpSession hs;
	
	@Autowired
	private UserService us;
	
	@Autowired
	private CategoryService cs;
	
	@Autowired
	private IdeaService is;
	
	@Autowired
	private SurveyService surs;

	
	
	
	@RequestMapping(value = {"/index", "/"}, method = RequestMethod.GET)
	public ModelAndView welcomePage(Map<String, Object> map){
			map.put("ideas", is.getAllIdeas());
			return new ModelAndView("index", map);
		}

	
	@RequestMapping(value = "/connection", method = RequestMethod.GET)
	public ModelAndView connectionGet(@ModelAttribute User user) {
		return new ModelAndView("connection", null);
	}
	
	@RequestMapping(value = "/connection", method = RequestMethod.POST)
	public ModelAndView connectionPost(@RequestParam Map<String, Object> map,
			@ModelAttribute User user) {
		
		User newUser = us.openSession(user);

		if(newUser != null){
			hs.setAttribute("id", newUser.getId());
			map.put("user", newUser);
			return ideaGet(map);
		}else{
			return new ModelAndView("connection", map);
		}
		
	}
	
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView inscriptionGet(@ModelAttribute User user) {
		return new ModelAndView("registration", null);
	}
	
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public ModelAndView inscriptionPost(@RequestParam Map<String, Object> map, 
			@ModelAttribute User user) {
		User newUser = new User(user.getEmail(), user.getLogin(), user.getPassword());
		newUser.setActive(true);
		us.addUser(newUser);
		return ideaGet(map);
	}
	
	
	@RequestMapping(value = "/addIdeaRating", method = RequestMethod.GET)
	public ModelAndView addIdeaRatingGet(Map<String, Object> map, @ModelAttribute("idea") Idea idea){
		List<Category> categories = cs.getAllCategories();
		map.put("categories", categories);
		return new ModelAndView("formRatings", map);
	}
	
	
	@RequestMapping(value = "/addIdeaRating", method = RequestMethod.POST)
	public ModelAndView addIdeaRatingPost(@RequestParam Map<String, Object> map,
									@ModelAttribute("idea") Idea idea){
		String titleIdea =  idea.getTitle();
		String descIdea = idea.getDescription();
		int idCategory = Integer.parseInt(map.get("id_category").toString());
		Category category = cs.getCategoryById(idCategory);
		Idea newIdea = new Idea(titleIdea, descIdea, us.findUserById(hs.getAttribute("id").toString()), category);
		map.put("newIdea", newIdea);
		is.addIdea(newIdea);
		return ideaGet(map);
		
	}

	   
    @RequestMapping(value = "/addIdeaSurvey", method = RequestMethod.GET)
    public ModelAndView addIdeaSurveyGet(Map<String, Object> map){
        List<Category> categories = cs.getAllCategories();
        map.put("categories", categories);
        return new ModelAndView("formSurveys", map);
    }
    
    
    @RequestMapping(value = "/addIdeaSurvey", method = RequestMethod.POST)
    public ModelAndView addIdeaSurveyPost(@RequestParam Map<String, Object> map){
        return ideaGet(map);
        
    }
	
	
	@RequestMapping(value = "/rating", method = RequestMethod.GET)
	public ModelAndView RatingGet(Map<String, Object> map, @RequestParam int id, @ModelAttribute Rating rating){
		map.put("ideaToVote", is.getIdeaById(id));
		return new ModelAndView("rating", map);
	}
	
	
	   @RequestMapping(value = "/rating", method = RequestMethod.POST)
	   public ModelAndView RatingPost(Map<String, Object> map){
	       return ideaGet(map);
	   }
	    
	
	@RequestMapping(value = "/deconnection", method = RequestMethod.GET)
	public ModelAndView deconnection(Map<String, Object> map){
		hs.invalidate();
		return ideaGet(map);
	}
	
	@RequestMapping(value = "/gestionUsers", method = RequestMethod.GET)
	public ModelAndView gestionUsersGet(Map<String, Object> map){
		List<User> users = us.getAllUsers();
		System.out.println(users);
		map.put("users", users);
		return new ModelAndView("gestionUsers", map);
	}
	
	
	
	//Méthode qui gère l'affichage des idées sur la page d'accueil
	public ModelAndView ideaGet(Map<String, Object> map) {
		// TO DO : vérifier que la session n'a pas expiré
		List<Idea> ideas = is.getAllIdeas();
		System.out.println(ideas);
		if (hs.getAttribute("id") != null) {
			map.put("user", us.findUserById(hs.getAttribute("id").toString()));
		}
			map.put("ideas", ideas);
			return new ModelAndView("index", map);
		}
	}

	

