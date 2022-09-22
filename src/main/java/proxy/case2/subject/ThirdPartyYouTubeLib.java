package proxy.case2.subject;

import proxy.case2.Video;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();
    Video getVideo(String videoId);
}
