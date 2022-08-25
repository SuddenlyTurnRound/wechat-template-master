package com.wechat.template.service;

import com.wechat.template.domain.model.Weather;

/**
 * <p>
 *
 * @author Mingfei
 * @date 2022/8/25 0:45
 * @since v_1.0.0.RELEASE
 */
public interface WeatherTianQi {

    /**
     * 返回天气api
     * @param city
     * @return
     */
    Weather getWeather(String city);
}
