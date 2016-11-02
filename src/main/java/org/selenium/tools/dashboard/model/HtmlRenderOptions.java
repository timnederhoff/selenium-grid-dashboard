package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HtmlRenderOptions {

    public HtmlRenderOptions() {
    }

    private String html_footer_partial;
    private String main_js_file;
    private String primary_css_file_fallback;
    private String html_header_file;
    private String main_template;
    private String primary_css_file;
    private String main_js_fallback;
    private String jquery_file;
    private String jquery_fallback;
    private String html_nav_bar;
    private String main_template_fallback;

    public String getHtml_footer_partial() {
        return html_footer_partial;
    }

    public void setHtml_footer_partial(String html_footer_partial) {
        this.html_footer_partial = html_footer_partial;
    }

    public String getMain_js_file() {
        return main_js_file;
    }

    public void setMain_js_file(String main_js_file) {
        this.main_js_file = main_js_file;
    }

    public String getPrimary_css_file_fallback() {
        return primary_css_file_fallback;
    }

    public void setPrimary_css_file_fallback(String primary_css_file_fallback) {
        this.primary_css_file_fallback = primary_css_file_fallback;
    }

    public String getHtml_header_file() {
        return html_header_file;
    }

    public void setHtml_header_file(String html_header_file) {
        this.html_header_file = html_header_file;
    }

    public String getMain_template() {
        return main_template;
    }

    public void setMain_template(String main_template) {
        this.main_template = main_template;
    }

    public String getPrimary_css_file() {
        return primary_css_file;
    }

    public void setPrimary_css_file(String primary_css_file) {
        this.primary_css_file = primary_css_file;
    }

    public String getMain_js_fallback() {
        return main_js_fallback;
    }

    public void setMain_js_fallback(String main_js_fallback) {
        this.main_js_fallback = main_js_fallback;
    }

    public String getJquery_file() {
        return jquery_file;
    }

    public void setJquery_file(String jquery_file) {
        this.jquery_file = jquery_file;
    }

    public String getJquery_fallback() {
        return jquery_fallback;
    }

    public void setJquery_fallback(String jquery_fallback) {
        this.jquery_fallback = jquery_fallback;
    }

    public String getHtml_nav_bar() {
        return html_nav_bar;
    }

    public void setHtml_nav_bar(String html_nav_bar) {
        this.html_nav_bar = html_nav_bar;
    }

    public String getMain_template_fallback() {
        return main_template_fallback;
    }

    public void setMain_template_fallback(String main_template_fallback) {
        this.main_template_fallback = main_template_fallback;
    }

    @Override
    public String toString() {
        return String.format("{ html_footer_partial=%s, main_js_file=%s, primary_css_file_fallback=%s, html_header_file=%s, " +
                "main_template=%s, primary_css_file=%s, main_js_fallback=%s, jquery_file=%s, jquery_fallback=%s, html_nav_bar=%s, " +
                "main_template_fallback=%s }",
                html_footer_partial, main_js_file, primary_css_file_fallback, html_header_file, main_template, primary_css_file,
                main_js_fallback, jquery_file, jquery_fallback, html_nav_bar, main_template_fallback);
    }
}