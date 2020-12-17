package main.java.service;

import main.java.vo.New;

import java.util.List;

public interface NewService {
    public List<New> getNewsByNewsid(int newsid);
}
