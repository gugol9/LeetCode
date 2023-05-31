package com.company.Desing;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL {

    private long id;
    private Map<Long, String> map;

    public EncodeAndDecodeTinyURL() {
        map = new HashMap<>();
        id = 1;
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(id,longUrl);
        return Long.toString(id++);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Long.parseLong(shortUrl));

    }

}
