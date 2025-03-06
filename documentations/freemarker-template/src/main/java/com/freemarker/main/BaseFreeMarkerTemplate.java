package com.freemarker.main;

import freemarker.template.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

public class BaseFreeMarkerTemplate {

    public static void main(String[] args) throws IOException {
        File reportHtml = new File( "report.html");
        Template templateHtml = getTemplate();
        Reporter reporter = new Reporter();
        try (Writer fileWriter = new FileWriter(reportHtml)) {
            templateHtml.process(reporter.getDataModelWeb(), fileWriter);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
    }

    private static Template getTemplate() throws IOException {
        Configuration cfg = new Configuration(new Version(2, 3, 0));
        // 设置从指定的位置路径下加载template文件
        cfg.setClassForTemplateLoading(Reporter.class, "/");
        cfg.setDefaultEncoding("UTF-8");
        cfg.setLocale(Locale.US);
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
        return cfg.getTemplate("template_web.ftl");
    }
}
