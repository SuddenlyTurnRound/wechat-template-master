package com.wechat.template.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 *
 * @author Mingfei
 * @date 2022/8/24 22:14
 * @since v_1.0.0.RELEASE
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather {
    /**
     * 晚上风向
     */
    String wd_night;
    /**
     * 日期，北京时区
     */
    String date;
    /**
     * 最高温度
     */
    String high;
    /**
     * 星期，北京时区
     */
    String week;
    /**
     *
     */
    String text_night;
    /**
     * 白天风向
     */
    String wd_day;
    /**
     * 最低温度
     */
    String low;
    /**
     * 晚上风力
     */
    String wc_night;
    /**
     *
     */
    String text_day;
    /**
     * 白天风力
     */
    String wc_day;

    /**
     *
     */
    String text_now;

    /**
     * 当前温度
     */
    String temp;

    /**
     * 风级大小
     */
    String wind_class;

    /**
     * 风向
     */
    String wind_dir;

    /**
     * 城市
     */
    String city;

    /**
     * 当前天气
     */
    String text;

}

