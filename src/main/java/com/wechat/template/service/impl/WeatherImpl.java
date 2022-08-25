package com.wechat.template.service.impl;

import com.wechat.template.domain.model.Weather;
import com.wechat.template.service.WeatherTianQi;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * @author Mingfei
 * @date 2022/8/25 0:45
 * @since v_1.0.0.RELEASE
 */
@Service
public class WeatherImpl implements WeatherTianQi {

    @Override
    public Weather getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String,String> map = new HashMap<String,String>();
        // 地方行政代码
        map.put("district_id","210100");
        //这个是数据类型
        map.put("data_type","all");
        map.put("ak","4RXCn285ZPaVCSWol3kCOGYq5j9u2FPM");
        String res = restTemplate.getForObject(
                "https://api.map.baidu.com/weather/v1/?district_id={district_id}&data_type={data_type}&ak={ak}",
                String.class,
                map);
        com.alibaba.fastjson.JSONObject json = com.alibaba.fastjson.JSONObject.parseObject(res);


        com.alibaba.fastjson.JSONArray forecasts = json.getJSONObject("result").getJSONArray("forecasts");
        List<Weather> weathers = forecasts.toJavaList(Weather.class);
        com.alibaba.fastjson.JSONObject now = json.getJSONObject("result").getJSONObject("now");
        Weather weather = weathers.get(0);
        weather.setText_now(now.getString("text"));
        weather.setTemp(now.getString("temp"));
        weather.setWind_class(now.getString("wind_class"));
        weather.setWind_dir(now.getString("wind_dir"));
        return weather;
    }
}
