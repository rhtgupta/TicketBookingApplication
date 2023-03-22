package com.xyz.service;

import com.xyz.model.City;
import com.xyz.model.Screen;
import com.xyz.model.Show;
import com.xyz.model.Theatre;
import com.xyz.utils.Constants;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TheatreService {

    public Theatre createTheatre(final String theatreName, final int cityId) {
        Theatre newTheatre = new Theatre(123, theatreName, new ArrayList<>(), new City(cityId, "Xyz"));
        Constants.THEATRE_MAP.put(123, newTheatre);
        return newTheatre;
    }

    public Screen addScreen(final int theatreId, final String screenName) {
        Screen newScreen = new Screen(123, screenName, Constants.THEATRE_MAP.get(theatreId));
        Constants.SCREEN_MAP.put(123, newScreen);
        return newScreen;
    }

}
