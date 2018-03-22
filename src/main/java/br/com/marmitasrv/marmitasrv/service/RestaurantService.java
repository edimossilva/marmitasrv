package br.com.marmitasrv.marmitasrv.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import br.com.marmitasrv.marmitasrv.model.Restaurant;
import br.com.marmitasrv.marmitasrv.model.dto.RestaurantDTO;
import br.com.marmitasrv.marmitasrv.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private RestaurantRepository restaurantRepository;

	public Restaurant convertToEntity(RestaurantDTO restaurantDTO) throws ParseException {
		return modelMapper.map(restaurantDTO, Restaurant.class);
	}

	public RestaurantDTO convertToDto(Restaurant post) {
		return modelMapper.map(post, RestaurantDTO.class);
	}

	public Restaurant save(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}
}
