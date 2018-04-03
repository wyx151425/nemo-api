package com.rumofuture.nemo.util.constant;

public class NemoConst {

    public static final String TOKEN = "token";
    public static final String USER = "user";
    public static final String BOOK = "book";
    public static final String PAGE = "page";

    public static class AppType {
        public static final String WEB = "Web";
        public static final String ANDROID = "Android";
        public static final String IOS = "iOS";
    }

    public static class RequestHeader {
        public static final String DEVICE_ID = "deviceId";
        public static final String VERSION = "version";
        public static final String LANGUAGE = "language";
        public static final String APP_TYPE = "appType";
    }

    public static class Language {
        public static final String CHINESE = "Chinese";
        public static final String ENGLISH = "English";
    }

    public static class Cache {
        public static final String SEPARATOR = ":";
    }

    public static class PageModel {
        public static class Limit {
            public static final int USER = 32;
            public static final int BOOK = 32;
            public static final int PAGE = 64;
        }
    }
}
