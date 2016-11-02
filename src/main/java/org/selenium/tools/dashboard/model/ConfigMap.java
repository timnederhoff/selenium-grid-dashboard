package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConfigMap {

    public ConfigMap() {
    }

    private String auto_update_browser_versions;
    private String log_maximum_size;
    private IEDriver iedriver;
    private String default_role;
    private String auto_update_drivers;
    private HtmlRenderOptions html_render_options;
    private int http_request_timeout;
    private String[] node_additional_classpath;
    private VideoRecordingOptions video_recording_options;
    private String grid_extras_release_url;
    private String[] hub_additional_classpath;
    private GeckoDriver geckodriver;
    private String reboot_after_sessions;
    private String expose_directory;
    private String[] tear_down;
    private WebDriver webdriver;
    private String[] active_modules;
    private String[] hub_config_files;
    private int config_puller_http_timeout;
    private EdgeDriver edgedriver;
    private String auto_start_hub;
    private ChromeDriver chromedriver;
    private String[] disabled_modules;
    private String grid_extras_auto_update_check_interval;
    private String auto_start_node;
    private HubConfig hub_config;
    private Double log_maximum_age_ms;
    private Grid grid;
    private String[] setup;
    private GridJvmOptions grid_jvm_options;
    private String[] node_config_files;
    private GridExtrasJvmOptions grid_extras_jvm_options;
    private String enable_session_history;

    public String getAuto_update_browser_versions() {
        return auto_update_browser_versions;
    }

    public void setAuto_update_browser_versions(String auto_update_browser_versions) {
        this.auto_update_browser_versions = auto_update_browser_versions;
    }

    public String getLog_maximum_size() {
        return log_maximum_size;
    }

    public void setLog_maximum_size(String log_maximum_size) {
        this.log_maximum_size = log_maximum_size;
    }

    public IEDriver getIedriver() {
        return iedriver;
    }

    public void setIedriver(IEDriver iedriver) {
        this.iedriver = iedriver;
    }

    public String getDefault_role() {
        return default_role;
    }

    public void setDefault_role(String default_role) {
        this.default_role = default_role;
    }

    public String getAuto_update_drivers() {
        return auto_update_drivers;
    }

    public void setAuto_update_drivers(String auto_update_drivers) {
        this.auto_update_drivers = auto_update_drivers;
    }

    public HtmlRenderOptions getHtml_render_options() {
        return html_render_options;
    }

    public void setHtml_render_options(HtmlRenderOptions html_render_options) {
        this.html_render_options = html_render_options;
    }

    public int getHttp_request_timeout() {
        return http_request_timeout;
    }

    public void setHttp_request_timeout(int http_request_timeout) {
        this.http_request_timeout = http_request_timeout;
    }

    public String[] getNode_additional_classpath() {
        return node_additional_classpath;
    }

    public void setNode_additional_classpath(String[] node_additional_classpath) {
        this.node_additional_classpath = node_additional_classpath;
    }

    public VideoRecordingOptions getVideo_recording_options() {
        return video_recording_options;
    }

    public void setVideo_recording_options(VideoRecordingOptions video_recording_options) {
        this.video_recording_options = video_recording_options;
    }

    public String getGrid_extras_release_url() {
        return grid_extras_release_url;
    }

    public void setGrid_extras_release_url(String grid_extras_release_url) {
        this.grid_extras_release_url = grid_extras_release_url;
    }

    public String[] getHub_additional_classpath() {
        return hub_additional_classpath;
    }

    public void setHub_additional_classpath(String[] hub_additional_classpath) {
        this.hub_additional_classpath = hub_additional_classpath;
    }

    public GeckoDriver getGeckodriver() {
        return geckodriver;
    }

    public void setGeckodriver(GeckoDriver geckodriver) {
        this.geckodriver = geckodriver;
    }

    public String getReboot_after_sessions() {
        return reboot_after_sessions;
    }

    public void setReboot_after_sessions(String reboot_after_sessions) {
        this.reboot_after_sessions = reboot_after_sessions;
    }

    public String getExpose_directory() {
        return expose_directory;
    }

    public void setExpose_directory(String expose_directory) {
        this.expose_directory = expose_directory;
    }

    public String[] getTear_down() {
        return tear_down;
    }

    public void setTear_down(String[] tear_down) {
        this.tear_down = tear_down;
    }

    public WebDriver getWebdriver() {
        return webdriver;
    }

    public void setWebdriver(WebDriver webdriver) {
        this.webdriver = webdriver;
    }

    public String[] getActive_modules() {
        return active_modules;
    }

    public void setActive_modules(String[] active_modules) {
        this.active_modules = active_modules;
    }

    public String[] getHub_config_files() {
        return hub_config_files;
    }

    public void setHub_config_files(String[] hub_config_files) {
        this.hub_config_files = hub_config_files;
    }

    public int getConfig_puller_http_timeout() {
        return config_puller_http_timeout;
    }

    public void setConfig_puller_http_timeout(int config_puller_http_timeout) {
        this.config_puller_http_timeout = config_puller_http_timeout;
    }

    public EdgeDriver getEdgedriver() {
        return edgedriver;
    }

    public void setEdgedriver(EdgeDriver edgedriver) {
        this.edgedriver = edgedriver;
    }

    public String getAuto_start_hub() {
        return auto_start_hub;
    }

    public void setAuto_start_hub(String auto_start_hub) {
        this.auto_start_hub = auto_start_hub;
    }

    public ChromeDriver getChromedriver() {
        return chromedriver;
    }

    public void setChromedriver(ChromeDriver chromedriver) {
        this.chromedriver = chromedriver;
    }

    public String[] getDisabled_modules() {
        return disabled_modules;
    }

    public void setDisabled_modules(String[] disabled_modules) {
        this.disabled_modules = disabled_modules;
    }

    public String getGrid_extras_auto_update_check_interval() {
        return grid_extras_auto_update_check_interval;
    }

    public void setGrid_extras_auto_update_check_interval(String grid_extras_auto_update_check_interval) {
        this.grid_extras_auto_update_check_interval = grid_extras_auto_update_check_interval;
    }

    public String getAuto_start_node() {
        return auto_start_node;
    }

    public void setAuto_start_node(String auto_start_node) {
        this.auto_start_node = auto_start_node;
    }

    public HubConfig getHub_config() {
        return hub_config;
    }

    public void setHub_config(HubConfig hub_config) {
        this.hub_config = hub_config;
    }

    public Double getLog_maximum_age_ms() {
        return log_maximum_age_ms;
    }

    public void setLog_maximum_age_ms(Double log_maximum_age_ms) {
        this.log_maximum_age_ms = log_maximum_age_ms;
    }

    public Grid getGrid() {
        return grid;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    public String[] getSetup() {
        return setup;
    }

    public void setSetup(String[] setup) {
        this.setup = setup;
    }

    public GridJvmOptions getGrid_jvm_options() {
        return grid_jvm_options;
    }

    public void setGrid_jvm_options(GridJvmOptions grid_jvm_options) {
        this.grid_jvm_options = grid_jvm_options;
    }

    public String[] getNode_config_files() {
        return node_config_files;
    }

    public void setNode_config_files(String[] node_config_files) {
        this.node_config_files = node_config_files;
    }

    public GridExtrasJvmOptions getGrid_extras_jvm_options() {
        return grid_extras_jvm_options;
    }

    public void setGrid_extras_jvm_options(GridExtrasJvmOptions grid_extras_jvm_options) {
        this.grid_extras_jvm_options = grid_extras_jvm_options;
    }

    public String getEnable_session_history() {
        return enable_session_history;
    }

    public void setEnable_session_history(String enable_session_history) {
        this.enable_session_history = enable_session_history;
    }

    @Override
    public String toString() {
        return String.format("{ auto_update_browser_versions=%s, log_maximum_size=%s, iedriver=%s, default_role=%s, auto_update_drivers=%s, " +
                "html_render_options=%s, http_request_timeout=%d, node_additional_classpath=%s, video_recording_options=%s, " +
                "grid_extras_release_url=%s, hub_additional_classpath=%s, geckodriver=%s, reboot_after_sessions=%s, " +
                "expose_directory=%s, tear_down=%s, webdriver=%s, active_modules=%s, hub_config_files=%s, config_puller_http_timeout=%d, " +
                "edgedriver=%s, auto_start_hub=%s, chromedriver=%s, disables_modules=%s, grid_extras_auto_update_check_interval=%s, " +
                "auto_start_node=%s, hub_config=%s, log_maximum_age_ms=%f, grid=%s, setup=%s, grid_jvm_options=%s, " +
                "node_config_files=%s, grid_extras_jvm_options=%s, enable_session_history=%s }",
                auto_update_browser_versions, log_maximum_size, iedriver, default_role, auto_update_drivers, html_render_options, http_request_timeout,
                Arrays.toString(node_additional_classpath), video_recording_options, grid_extras_release_url,
                Arrays.toString(hub_additional_classpath), geckodriver, reboot_after_sessions, expose_directory,
                Arrays.toString(tear_down), webdriver, Arrays.toString(active_modules), Arrays.toString(hub_config_files),
                config_puller_http_timeout, edgedriver, auto_start_hub, chromedriver, Arrays.toString(disabled_modules),
                grid_extras_auto_update_check_interval, auto_start_node, hub_config, log_maximum_age_ms, grid, Arrays.toString(setup),
                grid_jvm_options, Arrays.toString(node_config_files), grid_extras_jvm_options, enable_session_history);
    }
}