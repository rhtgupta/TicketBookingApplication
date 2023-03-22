package com.xyz.service;

import com.xyz.model.Screen;
import com.xyz.utils.Constants;
import org.springframework.stereotype.Service;

@Service
public class ScreenService {
    public Screen getScreen(final int screenId) {
        return Constants.SCREEN_MAP.get(screenId);
    }
}
