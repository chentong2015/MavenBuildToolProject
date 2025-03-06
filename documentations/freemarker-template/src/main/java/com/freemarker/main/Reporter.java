package com.freemarker.main;

import java.util.HashMap;
import java.util.Map;

public class Reporter {

    private Map<String, Object> dataModelWeb = new HashMap<>();

    // 为模板文件提供的数据模型
    public Map<String, Object> getDataModelWeb() {
        dataModelWeb.clear();
        dataModelWeb.put("firstname", "chen");
        dataModelWeb.put("lastname", "tong");
        return dataModelWeb;
    }
}
