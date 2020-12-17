package main.java.controller;

import main.java.api.fanyi.TransApi;
import main.java.service.LanguageService;
import main.java.vo.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class LanguageController {
    @Autowired
    LanguageService languageService;


    @RequestMapping(value ="getSelect.do")
    @ResponseBody
    public List<Language> getSelect(String groupId){
        return languageService.getLanguageByGroupId(groupId);
    }

    @RequestMapping(value = "getFanyi.do",produces = "text/html;charset=utf-8")
    @ResponseBody
    public String getFanyi(@RequestBody Map<String,String> map){
        return TransApi.getTransResult(map.get("text"),map.get("from"),map.get("to"));
    }
}
