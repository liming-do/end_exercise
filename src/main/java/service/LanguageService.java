package main.java.service;

import main.java.vo.Language;

import java.util.List;

public interface LanguageService {

    public List<Language> getLanguageByGroupId(String groupId);
}

