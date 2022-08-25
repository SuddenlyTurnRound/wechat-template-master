package com.wechat.template.service;

import cn.hutool.json.JSONObject;
import com.wechat.template.domain.model.Weather;
import com.wechat.template.domain.model.WeatherInfo;
import com.wechat.template.domain.vo.WechatSendMsgVo;

import java.util.List;

public interface WeiXinService {

    /**
     * 获取accessToken
     *
     * @param appId
     * @param appSecret
     * @return
     */
    String getAccessToken(String appId, String appSecret);


    /**
     * 获取用户信息
     *
     * @param accessToken
     * @return
     */
    List<String> getUserList(String accessToken);


    /**
     * 发送模板消息
     *
     * @param sendMsgVo
     * @param token
     * @param openId
     * @return
     */
    JSONObject sendMsg(WechatSendMsgVo sendMsgVo, String token, String openId);

    /**
     * 彩虹屁信息
     *
     * @param appKey
     * @return
     */
    String getCaiHongPiInfo(String appKey);

    /**
     * 早安
     *
     * @param appKey
     * @return
     */
    String getZaoAnInfo(String appKey);

    /**
     * 天气信息
     *
     * @param appKey
     * @param city
     * @return
     */
    WeatherInfo getWeatherInfo(String appKey, String city);



    /**
     * 笑话
     *
     * @param appKey
     * @return
     */
    String getJoke(String appKey);

    /**
     * 土味情话
     *
     * @param appKey
     * @return
     */
    String getSayLove(String appKey);
}
