package org.selenium.tools.dashboard.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VideoRecordingOptions {

    public VideoRecordingOptions() {
    }

    private String frames;
    private String frameSeconds;
    private String videos_to_keep;
    private String lower_third_background_color;
    private String idle_video_timeout;
    private String width;
    private String video_output_dir;
    private String title_frame_font_color;
    private String record_test_videos;
    private String height;
    private String lower_third_font_color;

    public String getFrames() {
        return frames;
    }

    public void setFrames(String frames) {
        this.frames = frames;
    }

    public String getFrameSeconds() {
        return frameSeconds;
    }

    public void setFrameSeconds(String frameSeconds) {
        this.frameSeconds = frameSeconds;
    }

    public String getVideos_to_keep() {
        return videos_to_keep;
    }

    public void setVideos_to_keep(String videos_to_keep) {
        this.videos_to_keep = videos_to_keep;
    }

    public String getLower_third_background_color() {
        return lower_third_background_color;
    }

    public void setLower_third_background_color(String lower_third_background_color) {
        this.lower_third_background_color = lower_third_background_color;
    }

    public String getIdle_video_timeout() {
        return idle_video_timeout;
    }

    public void setIdle_video_timeout(String idle_video_timeout) {
        this.idle_video_timeout = idle_video_timeout;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getVideo_output_dir() {
        return video_output_dir;
    }

    public void setVideo_output_dir(String video_output_dir) {
        this.video_output_dir = video_output_dir;
    }

    public String getTitle_frame_font_color() {
        return title_frame_font_color;
    }

    public void setTitle_frame_font_color(String title_frame_font_color) {
        this.title_frame_font_color = title_frame_font_color;
    }

    public String getRecord_test_videos() {
        return record_test_videos;
    }

    public void setRecord_test_videos(String record_test_videos) {
        this.record_test_videos = record_test_videos;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getLower_third_font_color() {
        return lower_third_font_color;
    }

    public void setLower_third_font_color(String lower_third_font_color) {
        this.lower_third_font_color = lower_third_font_color;
    }

    @Override
    public String toString() {
        return String.format("{ frames=%s, frameSeconds=%s videos_to_keep=%s, lower_third_background_color=%s, idle_video_timeout=%s, " +
                "width=%s, video_output_dir=%s, title_frame_font_color=%s, record_test_videos=%s, height=%s, lower_third_font_color=%s }",
                frames, frameSeconds, videos_to_keep, lower_third_background_color, idle_video_timeout, width, video_output_dir,
                title_frame_font_color, record_test_videos, height, lower_third_font_color);
    }
}