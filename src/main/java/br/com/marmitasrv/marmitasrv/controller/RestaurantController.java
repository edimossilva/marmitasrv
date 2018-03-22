package br.com.marmitasrv.marmitasrv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.marmitasrv.marmitasrv.model.Restaurant;
import br.com.marmitasrv.marmitasrv.model.dto.RestaurantDTO;
import br.com.marmitasrv.marmitasrv.service.RestaurantService;

@Controller
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;

	@RequestMapping("/")
	@ResponseBody()
	String hello() {
		return "hello Restaurant";
	}

	@RequestMapping(value = "/marmita/api/restaurant", method = RequestMethod.POST)
	@ResponseBody()
	RestaurantDTO save(@RequestBody RestaurantDTO restaurantDTO) {
		Restaurant restaurant = restaurantService.convertToEntity(restaurantDTO);
		Restaurant newRestaurant = restaurantService.save(restaurant);
		RestaurantDTO callbackRestaurant = restaurantService.convertToDto(newRestaurant);
		return callbackRestaurant;
	}

	// @RequestMapping(method = RequestMethod.POST)
	// @ResponseStatus(HttpStatus.CREATED)
	// @ResponseBody
	// public PostDto createPost(@RequestBody PostDto postDto) {
	// Post post = convertToEntity(postDto);
	// Post postCreated = postService.createPost(post));
	// return convertToDto(postCreated);
	// }
}
