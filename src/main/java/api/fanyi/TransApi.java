package main.java.api.fanyi;

import main.java.tools.MD5;

import java.util.HashMap;
import java.util.Map;

public class TransApi {
    public static void main(String[] args){
        System.out.println(getTransResult("你好","zh","en"));
    }


    private static final String TRANS_API_HOST = "http://api.fanyi.baidu.com/api/trans/vip/translate";

    private static  String appid="20201214000646995";
    private  static String securityKey="LFzJj2Nv_DHxFUws8Kij";


    public static String getTransResult(String query, String from, String to) {
        Map<String, String> params = buildParams(query, from, to);
        return HttpGet.get(TRANS_API_HOST, params);
    }

    private  static  Map<String, String> buildParams(String query, String from, String to) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("q", query);
        params.put("from", from);
        params.put("to", to);

        params.put("appid", appid);

        // 随机数
        String salt = String.valueOf(System.currentTimeMillis());
        params.put("salt", salt);

        // 签名
        String src = appid + query + salt + securityKey; // 加密前的原文
        params.put("sign", MD5.md5(src));

        return params;
    }

}
