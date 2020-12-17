package main.java.controller;

import main.java.service.ImageService;
import main.java.service.NewService;
import main.java.vo.Image;
import main.java.vo.New;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class NewsController {
    @Autowired
    private NewService newService;
    @Autowired
    private ImageService imageService;
    @RequestMapping(value = "getNewsByNewsid.do")
    @ResponseBody
    public Map<String,Object>getNewsByNewsid(String newsid){
        int newid=Integer.parseInt(newsid);
        List<New> newList=newService.getNewsByNewsid(newid);
        Map<String,Object>map=new HashMap<String,Object>();
        map.put("newlist",newList);
        return map;
    }

    @RequestMapping(value = "getImagesByGroupId.do")
    public String getNewsImage(HttpSession session){
        List<Image> imageList=imageService.getImagesByGroupId("2");
        session.setAttribute("newsimage",imageList);
        return "news";
    }
}
